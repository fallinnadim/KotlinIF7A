
import kotlin.math.roundToInt

class Car(val make: String, val color: String)

class Contact(var fullName: String, var emailAddress: String)

class Contact2(var fullName: String, val emailAddress: String)

class Contact3(var fullName: String, val emailAddress: String, var type: String = "Friend")

class Person(val firstName: String, val lastName: String){
    val age: Int = 20
    val fullName: String
        get() {
            return "${firstName} + ${lastName}"
        }
}

class Address {
    var address1: String
    var address2: String? = null
    var city = ""
    var state: String
    init {
        address1 = ""
        state = ""
    }
}

class TV(var height: Double, var width: Double){
    var diagonal: Int
        get() {
            val result = Math.sqrt(height * height + width * width)
            return result.roundToInt()
        }
        set(value) {
            val ratioWidth = 16.0
            val ratioHeight = 9.0
            val ratioDiagonal = Math.sqrt(ratioWidth * ratioWidth + ratioHeight * ratioHeight)
            height = value * ratioHeight / ratioDiagonal
            width = value * ratioWidth / ratioDiagonal
        }
}

class Level(val id: Int, var boss: String, var unlocked: Boolean){
    companion object{
        var highestLevel = 1
    }
}

fun main(){
    // Constructor properties
    val car = Car(make = "Honda", color = "Black")
    //car.make = "Toyota"
    //car.color = "silver"
    println("Car make : ${car.make}")
    println("Car color : ${car.color}")

    val contact = Contact(fullName = "Grace Murray", emailAddress = "grace@navy.mil")
    val name = contact.fullName
    val email = contact.emailAddress
    println("Name : $name")
    println("Email : $email")

    contact.fullName = "Grace Hopper"
    val grace = contact.fullName
    println("Name : $grace")

    val contact2 = Contact2(fullName = "Grace", emailAddress = "grace@navy.mil")
    contact2.fullName = "Grace Valentine"
//    contact2.emailAddress = "grace@email.com" // error karena menggunakan val

    // Memberikan nilai default values
    val contact3 = Contact3(fullName = "Grace", emailAddress = "grace@navy.mil",)

    // Property
    val person = Person("Grace", "Hopper")
    println(person.fullName) //Grace Hopper

    val address = Address()

    // Custom accessors
    val tv = TV(height = 53.93, width = 95.87)
    val size = tv.diagonal //110
    println(size)

    tv.width = tv.height
    val diagonal = tv.diagonal // 76
    println(diagonal)

    tv.diagonal = 70
    println(tv.height)
    println(tv.width)


    // Companion object properties
    val level1 = Level(id = 1, boss = "Chameleon", unlocked = true)
    val level2 = Level(id = 1, boss = "Squid", unlocked = false)
    val level3 = Level(id = 1, boss = "Chupacabra", unlocked = false)
    val level4 = Level(id = 1, boss = "Yeti", unlocked = false)

    // Error: can't access members of companinon object on an instance
    // val highesLevel = level3.highestlevel
    var highestLevel = Level.highestLevel// 1


}