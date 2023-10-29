import kotlin.math.*

fun main() {
    println("Hello World")
    // Contoh single line comment

    /* Contoh suatu
    multi line comment
     */

    // Deklarasi Variabel
    var name: String = "Nadim" // Strongly Typed
    var umur: Int = 20
    var statusMenikah = false // Typed Inference
    println(umur)
    umur = 21
    println("My Name is " + name) // String Concatenation
    println("Nama Saya : ${name} dan umur saya : ${umur++} ") // String Interpolation
    println(umur)
    println(statusMenikah)

    // var adalah variable yang bisa diubah nilainya

    // val adalah konstanta
    val pendidikan: String = "Mahasiswa"
    println("Pendidikan Saya saat ini : ${pendidikan}") // String Interpolation

    val angka1: Int = 10
    val angka2: Int = 20

    println("${angka1} + ${angka2} = ${angka1+angka2} ")

    val firstName = "Fernandi"
    val lastName = "Saputra"
    println("Nama Lengkap : ${firstName} ${lastName} ")
    println("Inisial : ${firstName[0]}${lastName[0]} ") // String adalah array of character

    // Tipe data char
    val karakter: Char = 'A' // Char petik satu dan satu karakter
    var huruf: Char = 'B' // Char petik satu dan satu karakter
    println(karakter)
    println("Huruf : ${--huruf}")

    // Escaped String (\t, \n, \", \', \\, \u)
    // \u untuk unicode
    val kalimat: String = "Kotlin Itu Mudah"
    println("\"${kalimat}\"")

    // Raw String
    val line: String = "Baris 1\n" +
                    "Baris 2\n" +
                    "Baris 3\n" +
                    "Baris 4\n"
    println(line)
    
    val baris = """
    ini baris satu
    ini baris dua
    ini baris tiga
    """.trimIndent() // trimIndent menghilangkan spasi
    println(baris)

    // Math Function
    // import kotlin.math.*
    println(sin(45 * PI / 180))
    println(sqrt(9.0))
    println(max(17, -90))
    println(min(3, 5))
    
    // Increment dan Decrement
    var counter: Int = 0
    counter += 2 
    counter -= 3
    println(counter) 
    counter *= 4 
    counter /= 3
    println(counter) 

    // Substring
    val pesan = "Kotlin itu Menyenangkan!"
    println(pesan.substring(11, 23))
    println(pesan.first()) // ambil karakter pertama string
    println(pesan.last()) // ambil karakter terakhir string
    println(pesan.dropLast(1)) // drop karakter sebanyak n parameter
    println(pesan[0])
}
