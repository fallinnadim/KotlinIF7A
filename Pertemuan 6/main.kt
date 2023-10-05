fun main() {
    cetakNama()
    cetakPerkalian5()
    cetakPerkalian(10, 20)
    var hasilKali = perkalian(nilai = 7, 12)
    var hasilBagi = multiplyAndDivide(10, 2)
    var hasilKali2 = multiplyInferred(30, 3)
    println(hasilBagi.first)
    println(hasilKali2)
    // function as variable
    var sebuahVariable = ::add
    println(sebuahVariable(3, 3))
    printResult(::add, 3, 5) // first order logic

    // anonymous function
    val plusOne = { 
        number: Int -> number + 1
    }
    println("Nilai dari 5 + 1 adlaah ${plusOne(5)}")

    val repeatMe: String.(Int) -> String = { times -> this.repeat(times) }
    val twoParameters: (String, Int) -> String = repeatMe
    println(twoParameters("ABC ", 10))

    fun transformasi(f: (String, Int) -> String): String {
        return f("Morning ", 10)
    }

    val hasil = transformasi(repeatMe)
    println(hasil)

}

fun cetakNama() {
    println("Nama saya adalah Rizqy")
}

fun cetakPerkalian5(nilai: Int = 3) { // fungsi bisa pakai keyword parameter
    println("$nilai * 5 = ${nilai * 5}")
}

fun cetakPerkalian(pengali: Int, nilai: Int) { // bisa default value parameter
    println("$pengali * $nilai = ${pengali * nilai}")
}

fun perkalian(nilai: Int, pengali: Int): Int {
    return nilai * pengali
}

fun multiplyAndDivide(number: Int, factor: Int): Pair<Int, Int> {
    return Pair(number * factor, number / factor)
}

fun multiplyInferred(number: Int, multiplier: Int) = number * multiplier // function inferred

fun getValue(value: Int): Int {
    return value + 1
}

fun getValue(value: String): String {
    return "The value is $value"
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun printResult(function: (Int, Int)-> Int, a: Int, b: Int){ // function as a parameter
    var result = function(a, b)
    println(result)
}