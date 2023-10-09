import kotlin.math.*
fun main() {
    soal1()
    soal2()
    soal3()
    soal4("februari", 2000) // Masukan bulan (huruf kecil) dan tahun
    soal5(7) //Fibonaci angka berapa
}

fun soal1() {
    println("================= Soal 1 =================")
    var age:Int = 16
    println(age)
    age = 30
    println(age)
    println("""deklarasi variabel age menggunakan var karena pada 
    block kode varible age yang sudah di deklarasi di re-assign dengan nilai 30""")
}

fun soal2() {
    println("================= Soal 2 =================")
    val degree:Double = 30.0
    val radian:Double = degree * PI / 180 
    println("Sudut ${degree} derajat memiliki nilai ${String.format("%.5f", radian)} radian") // 5 desimal
}

fun soal3() {
    println("================= Soal 3 =================")
    val coordinates:Pair<Int,Int> = Pair(7, 13)
    val (row, column) = coordinates
    println("Konstanta row dengan nilai : ${row} dan Konstanta column dengan nilai : ${column}")
}

fun soal4(month: String, year: Int){
    println("================= Soal 4 =================")
    var (days, kabisat) = dayCount(month, year)
    println("bulan ${month} tahun ${year} (${kabisat}) memiliki ${days} hari")
}
fun soal5(number :Int) {
    println("================= Soal 5 =================")
    println("Nilai Fibonacci(${number}) = ${fibonnacci(number)}")
}

fun dayCount(month: String, year: Int): Pair<Int, String>{
    val bulanDengan31Hari:Array<String> = arrayOf("januari", "maret", "mei", "juli", "agustus", "oktober", "desember")
    val bulanDengan30Hari:Array<String> = arrayOf("april", "juni", "september", "november")
    var kabisat: Boolean = kabisatChecker(year)
    var tahunKabisat: String = if (kabisat) "kabisat" else "bukan kabisat"
    if (bulanDengan31Hari.contains(month)) {
        return Pair(31, tahunKabisat)
    }
    else if (bulanDengan30Hari.contains(month)) {
        return Pair(30, tahunKabisat)
    }
    else {
        if (kabisat) {
            return Pair(29, tahunKabisat)
        }
        return Pair(28, tahunKabisat)
    }
}

fun kabisatChecker(year :Int) :Boolean {
    // kabisat jika habis dibagi 4 atau habis di bagi 400 TETAPI TIDAK kabisat jika habis dibagi 100
    // Cek apakah habis dibagi 4
    if (year % 4 == 0) {
        // Cek apakah habis dibagi 100
        if (year % 100 == 0) {
            // Cek apakah habis dibagi 400
            if (year % 400 == 0) {
                return true
            }
            return false
        }
    return true
    }
    return false
}

fun fibonnacci(number: Int): Int {
    // Fibonacci 0 1 1 2 3 5 8 13 21 ..
    // Jika 0 = 0
    if (number <=0) {
        return 0
    }
    // Jika 1 atau 2 = 1
    if (number > 0 && number <= 2) {
        return 1
    }
    // Selain itu rekursif fungsi fibonaci lagi n-1 dan n-2
    else {
        return fibonnacci(number-1) + fibonnacci(number-2)  
    }
}