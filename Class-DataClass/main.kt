import java.util.Random
import kotlin.collections.mutableListOf
// Nama Class tidak harus sama dengan function
class Person (var firstName: String, var lastName: String) { // primary constructor
    val fullname get() = "$firstName $lastName"
}
class SimplePerson(val name: String)

class Grade(val letter: String, val points: Double, val credits: Double)

class Student(
    val firstName: String, 
    val lastName: String, 
    val grades: MutableList<Grade> = mutableListOf(),
    var credits: Double = 0.0 ) 
    { 
        fun recordGrade(grade: Grade) {
            grades.add(grade)
            credits += grade.credits
        }
    }

fun main() {
    val john = Person(firstName = "Johnny", lastName = "Wijaya")
    println(john.lastName)
    // Reference Types, mirip pointer pada C ++
    var var1 = SimplePerson(name = "John")
    var var2 = var1
    // untuk membuat references types yang berbeda harus instansiasi class baru
    var var3 = SimplePerson(name = "John") // referensi yang berbeda

    var homeOwner = john
    john.firstName = "John"
    println(john.firstName) 
    println(homeOwner.firstName)
    // Object identity -> membandingkan referncesnya sama atau tidak -> boolean
    println(homeOwner === john) // true

    val impostorJohn = Person(firstName = "John", lastName = "Wijaya")
    println(impostorJohn === john) // false

    // Create fake, impostor John
    var impostor = (0 .. 100).map {  // membuat list
        Person(firstName = "John", lastName = "Wijaya")
    }
    // Cek apakah john asli ada diantara impostor
   println(impostor.contains(john)) //false

   val mutableImpostor = mutableListOf<Person>()
   mutableImpostor.addAll(impostor)
   mutableImpostor.contains(john) // false
   mutableImpostor.add(Random().nextInt(5), john)

   println(mutableImpostor.contains(john)) // true

   val indexOfJohn = mutableImpostor.indexOf(john)
   println(indexOfJohn)
   // cek apakah ada atau tidak
   if (indexOfJohn != -1) { // artinya ketemu
        mutableImpostor[indexOfJohn].lastName = "Budi"
   }
   println(john.fullname) // john budi

   val jane = Student(firstName = "Jane", lastName = "Radja")
   val computationalIntelligence = Grade(letter = "B", points = 9.0, credits = 3.0)
   val machineLearning = Grade(letter = "A", points = 16.0, credits = 4.0)

   jane.recordGrade(computationalIntelligence)
   jane.recordGrade(machineLearning)

   println(jane.credits) // 7.0
   val proposalTA = Grade(letter = "A", points = 8.0, credits = 2.0)
   jane.recordGrade(proposalTA)
   println(jane.credits) // 9.0

   val albert = Student(firstName = "Albert", lastName = "Einstein", id = 1)
    val richard = Student(firstName = "Richard", lastName = "Feynman", id = 2)
    val albertCopy = albert.copy(firstName = "Anton")

    println(albert)
    println(albertCopy)
    println(richard)
    println(albert.toString())

    println(albert == richard) // false
    println(albert == albertCopy) // true
    println(albert === albertCopy) // false

    // Data Class
    // Class spesial yang memiliki fungsi HashCode, Equals, toString dan copy()
    data class StudentData(var firstName: String,  var lastName: String, var id: Int)

    val marie = StudentData("Marie", "Curie", 1)
    val emmy = StudentData("Emmy", "Noether", 2)
    val marieCopy = marie.copy()

    println(marie)
    println(emmy)
    println(marie == emmy)
    println(marie == marieCopy)
    println(marie === marieCopy)

    // Destructuring Declaration -> hanya untuk data class
    val (firstName, lastName, id) = marie
}

class Students(var firstName: String,  var lastName: String, var id: Int) {
    // override -> modifikasi method bawaan
    override fun hashCode(): Int {
        val prime = 31
        var result = 1

        result = prime * result + firstName.hashCode()
        result = prime * result + id
        result = prime * result + lastName.hashCode()
        return result
    }

    override fun equals(other: Any?): Boolean {
        // membandingkan reference
        if (this === other)
            return true
        if (other == null)
            return false

        // membandingkan tipe class
        if (javaClass != other.javaClass)
            return false

        // membandingkan nilai nya sama atau tidak
        val obj = other as Student? // casting ke student, kalau berhasil ada nilai, gagal null
        if (firstName != obj?.firstName)
            return false
        if (lastName != obj.lastName)
            return false
        if (id != obj.id)
            return false

        return true
    }

    override fun toString(): String {
        return "Student(firstName= ${firstName}, lastName = ${lastName}, id = ${id}"
   }

    fun copy(firstName: String = this.firstName,
             lastName: String = this.lastName,
             id: Int = this.id) = Student(firstName, lastName, id)
}
