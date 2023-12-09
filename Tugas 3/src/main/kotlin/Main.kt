import kotlin.math.PI

fun main() {
    // Soal 1
    val karyawan1 = Karyawan(nama = "Jafar", "Office Boy", gaji = 2000000)
    val karyawan2 = Karyawan(nama = "Ahmad Zaky Nadimsyah", "Intern Backend Developer", gaji = 5000000)
    val karyawan3 = Karyawan(nama = "Imelia Dwinora Cahyati", "Senior UI / UX Designer", gaji = 25000000)

    val perusahaanBaru = Perusahaan()
    perusahaanBaru.tambahKaryawan(karyawan1)
    perusahaanBaru.tambahKaryawan(karyawan2)
    perusahaanBaru.tambahKaryawan(karyawan3)
    // Naik Haji Imel
    karyawan3.naikGaji(5000000)
    perusahaanBaru.listKaryawann()

    // Soal 2
    val newCircle = Circle(radius = 13.3)
    val area = newCircle.calculateArea()
    val perimeter = newCircle.calculatePerimeter()
    println("Lingkaran memiliki luas " + "%.3f".format(area) +" dan keliling " + "%.3f".format(perimeter))

}
class Karyawan(val nama: String, val jabatan: String, var gaji: Int) {
    fun naikGaji(tambahanGaji: Int) {
        gaji += tambahanGaji
    }
}

class Perusahaan(val daftarKaryawan: MutableList<Karyawan> = mutableListOf<Karyawan>()) {
    fun listKaryawann() {
        println("Informasi Karyawan di Perusahaan ini : ")
        println("----------------------")
        daftarKaryawan.forEachIndexed{ index, value ->
            println("Karyawan ${index+1}")
            println("Nama : ${value.nama}")
            println("Jabatan : ${value.jabatan}")
            println("Gaji : ${value.gaji}")
            println("----------------------")
        }
    }
    fun tambahKaryawan(karyawanBaru: Karyawan) {
        daftarKaryawan.add(karyawanBaru)
    }
}

class Circle(val radius: Double) : Shape {
    override fun calculateArea(): Double {
        return radius * radius
    }
    override fun calculatePerimeter(): Double {
        return radius * 2 * PI
    }
}

interface Shape {
    fun calculateArea() : Double
    fun calculatePerimeter() : Double
}