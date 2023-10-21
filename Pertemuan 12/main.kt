// prinsip design pattern singleton
// memastikan hanya ada satu instansi pada suatu program
data class Student (val id: Int, val firstName: String, val lastName: String) {
    var fullName = "${lastName}, ${firstName}"
}

object StudentRegistry {
    val allStudents = mutableListOf<Student>()

    fun addStudent(student: Student) {
        if (allStudents.contains(student))
            return
        allStudents.add(student)
    }
    fun removeStudent(student: Student) {
        allStudents.remove(student)
    }
    fun listAllStudents(){
        allStudents.forEach{
            println(it.fullName)
        }
    }
}

// Private constructor tidak bisa diakses diluar class
class Scientist private constructor(val id: Int, val firstName: String, val lastName: String) {
    // Companion object serupa dengan static pada Java
    companion object {
        var currentId = 0
        fun newScientist(firstName: String, lastName: String): Scientist {
            currentId += 1
            return Scientist(currentId, firstName, lastName)
        }
    }
    var fullName = "${firstName} ${lastName}"
}

object ScientistRepository {
    val allScientist = mutableListOf<Scientist>()
    fun addScientist(scientist: Scientist) {
        if (allScientist.contains(scientist))
            return
        allScientist.add(scientist)
    }
    fun removeStudent(scientist: Scientist) {
        allScientist.remove(scientist)
    }
    fun listAllScientist() {
        allScientist.forEach{
            println("${it.id} : ${it.fullName}")
        }
    }


}

interface Counts {
    fun studentCount() : Int
    fun scientistCount() : Int
}

fun main() {
    // Singletons
    // object
    val marie = Student(1, "Marie", "Curie")
    val albert = Student(2, "Albert", "Einstein")
    val richard = Student(3, "Richard", "Feynman")

    StudentRegistry.addStudent(marie)
    StudentRegistry.addStudent(albert)
    StudentRegistry.addStudent(marie)
    StudentRegistry.listAllStudents()

    val emmy = Scientist.newScientist("Emmy", "Noether")
    val isaac = Scientist.newScientist("Isaac", "Newton")
    val nick = Scientist.newScientist("Nikola", "Tesla")

    ScientistRepository.addScientist(emmy)
    ScientistRepository.addScientist(isaac)
    ScientistRepository.addScientist(nick)

    ScientistRepository.listAllScientist()

    val counter = object : Counts {
        override fun studentCount(): Int {
            return StudentRegistry.allStudents.size
        }

        override fun scientistCount(): Int {
            return ScientistRepository.allScientist.size
        }
    }
    println(counter.studentCount())
    println(counter.scientistCount())
}
