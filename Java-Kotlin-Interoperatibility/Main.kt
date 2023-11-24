fun main() {

    // 1. kotlin -----------------
    MainJava.printKotlin()

    println(MainJava.add(2, 3))
    println(MainJava.substract(5, 2))

    // class Animal dari bahasa Java
    val anjing = Animal(4, "Kuning")

    // getTotalFeet
    println(anjing.totalFeet)

    // getColor
    println(anjing.color)

    // setColor
    anjing.color = "Oren"

    println(anjing.color)

    val kucing = Kucing(totalFeetKucing = 4, colorKucing = "Item")
    println(kucing.totalFeetKucing)
    println(kucing.colorKucing)
    println(kucing.suara)
    kucing.cakar()

}

fun printJava() = println("Halo, ini dari kotlin")

fun multiply(a: Int, b: Int): Int = a * b
fun divide(a: Int, b: Int): Int = a / b

class Kucing(val suara: String = "Meong", val totalFeetKucing: Int, val colorKucing: String) : Animal(totalFeetKucing, colorKucing) {
    fun cakar() = println("Mampus kau human")
}