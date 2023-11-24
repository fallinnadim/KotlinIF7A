// 4 OOP pillar
// Inheritance, Abstraction, Polymorphism, Encapsulation
// Kotlin -> Single Inheritance
fun main (){
    data class Grade(val letter: Char, val points: Double, val credits: Double)
    // class secara default bersifat final
    // tidak ada batasan kedalaman dalam inheritance
    // gunakan open agar class bisa di inheritance
    open class Person(var firstName: String, var lastName: String) {
        fun fullName():String {
            return "$firstName $lastName"
        }
    }
    // : untuk inheritance
    open class Student(firstName: String, lastName: String, var grades: MutableList<Grade> = mutableListOf()) : Person(firstName, lastName) {
        open fun recordGrade(grade: Grade) {
            grades.add(grade)
        }
    }

    val john = Student(firstName = "Johnny", lastName = "Wijaya")
    val jane = Student(firstName = "Jane", lastName = "Wijaya")

    val history = Grade(letter = 'B', points = 9.0, credits = 3.0)
    john.recordGrade(history)

    open class BandMember(firstName: String, lastName: String) :Student(firstName, lastName) {
        open val minimumPracticeTime: Int
            get() {
                return 2
            }
    }
    class OboePlayer(firstName: String, lastName: String) :BandMember(firstName, lastName) {
        // keyword super untuk mengakses constructor, method dan properties pada super class
        override val minimumPracticeTime: Int
            get() = super.minimumPracticeTime
    }

    // Polymorphism
    // contoh method bersuara, beda hewan beda suara
    fun phoneBookName(person: Person):String {
        return "${person.lastName}, ${person.firstName}"
    }

    val person = Person(firstName = "Mega", lastName = "Wati")
    val oboePlayer = OboePlayer(firstName = "Soekarno", lastName = "Putri")

    println(phoneBookName(person))
    println(phoneBookName(oboePlayer)) // alasan bisa dipakai karena oboeplayer keturunan person

    // Runtime hierarchy check
    var hallMonitor = Student(firstName = "Jill", lastName = "Bananapeel")
    hallMonitor = oboePlayer // mengubah tipe class reference

    println(hallMonitor is OboePlayer) // true
    println(hallMonitor !is OboePlayer) // false
    println(hallMonitor is Person) // true
    
    // Casting -> konversi ke kelas 
    // kotlin
    // as : unsafe cast
    // as? : safe cast
    println((oboePlayer as Student).lastName)
    println((jane as? BandMember)?.minimumPracticeTime) // gagal
}
