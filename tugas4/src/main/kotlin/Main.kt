import exceptions.DivisionByZeroException

fun main() {
    // Soal 1
    KotlinCaller.callFromJava()
    // Soal 2
    try {
        simpleDivider(12, 0)
    } catch (e: DivisionByZeroException) {
        println(e.localizedMessage)
    }
    // Soal 3
    val randomNumber: List<Int> = (393..439).toList()
    val evenNumber = filterEvenNumbers(randomNumber)
    println("List Bilangan Genap : $evenNumber ")
    // Soal 4
    val point1 = Point(3, -15)
    val point2 = Point(15, 30)
    var penjumlahanPoint = Point()
    penjumlahanPoint = point1 + point2
    println("Koordinat baru di : ${penjumlahanPoint.xCoordinate} , ${penjumlahanPoint.yCoordinate}")
    // Soal 5
    // Penggunaan keyword suspend dalam deklarasi fungsi pada konteks Kotlin Co-routines digunakan agar fungsi bisa dipanggil secara asynchronus yang membuat fungsi tersebut
    // tidak harus menunggu block kode sekuensial sebelumnya selesai dieksekusi
}

class KotlinCaller {
    companion object {
        fun callFromJava () {
            JavaIntertop.printMessage()
        }
    }
}

fun simpleDivider (dividend: Int, divisor: Int) : Double {
    if (divisor == 0) {
        throw DivisionByZeroException()
    }
    return dividend.toDouble() / divisor
}

fun filterEvenNumbers(numbers: List<Int>): MutableList<Int> {
    var evenNumbers: MutableList<Int> = mutableListOf<Int>()
    numbers.forEach{
        // Ganjil
        if (it % 2 == 0) {
            evenNumbers.add(it)
        }
    }
    return evenNumbers
}

class Point (val xCoordinate: Int = 0, val yCoordinate: Int = 0) {
    operator fun plus(point: Point) : Point {
        return Point(xCoordinate + point.xCoordinate, yCoordinate + point.yCoordinate)
    }
}

