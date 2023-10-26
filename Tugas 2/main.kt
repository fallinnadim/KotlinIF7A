var result:Int? = null // nullable int untuk return function divideOfWhole
var count:Int = 0 // count menghitung berapa kali rekursif call
fun main() {
    soal1()
    soal2()
    soal3()
}
fun divideOfWhole(value: Int, divisor: Int) :Int?{
    // Base Case
    if ((value % divisor) != 0) return result
    else { // Rekursif
        count++
        result = count
        return divideOfWhole((value/divisor), divisor)
    }
}
fun soal1() {
    println("================= Soal 1 =================")
    var result = divideOfWhole(32, 2)
    if (result == null) println("Not divisible :[") 
    else println("Yep, it divides ${result} times")
    println("***********Modifikasi Code dengan Elvis Operator***********")
    var elvisWithElvis = result ?: 0
    println("It divides ${elvisWithElvis} times")
}


fun soal2() {
    println("================= Soal 2 =================")
    val usStatesCode = //Map Of States Code of the United States
            mapOf(
            "AL" to "Alabama", "AZ" to "Arizona", "CA" to "California", "CO" to "Colorado", "CT" to "Connecticut",
            "FL" to "Florida", "GA" to "Georgia", "IN" to "Indiana", "KS" to "Kansas", "LA" to "Louisianna",
            "MN" to "Minnesota", "NH" to "New Hamsphere", "NY" to "New York", "OK" to "Oklahoma", "WI" to "Wisconsin",
            )
    val filterResult = usStatesCode.filterValues { it.length > 8 } // Filter Value with condition
    println("List States di US dengan panjang nama lebih dari 8 karakter :")
    for ((_, v) in filterResult) {
        print("${v} ")
    }
    println("")
}

fun soal3() {
    println("================= Soal 3 =================")
    // Define function body
    lateinit var faktorial: (Int) -> Int //lateinit agar bisa inisialisasi variabel faktorian untuk rekursif
    faktorial = { 
        // Base Case
        if (it <= 1) 1 
        // rekursif
        else it * faktorial(it - 1)
    }
    // Function Call
    println(faktorial(5))
}


