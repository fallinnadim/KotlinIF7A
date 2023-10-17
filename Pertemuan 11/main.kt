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
}