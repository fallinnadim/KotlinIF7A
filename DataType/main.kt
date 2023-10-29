fun main() {
    println("Hello World")
    // Type Data
    // Long, Int, Short, Byte, Float, Double
    var angkaShort : Short = 32766
    var angkaint : Int = 234232332
    var hehe = angkaShort + 200009999999
    var a = angkaShort + 2000
    val angkaLong2 = 2000L // suffix L untuk angka long
    val angkaBiner = 0b10101011 // 171 dengan tambahkan prefix 0b
    // prefix x untuk hexa

    val angkaFloat: Float = 0.11111111111111111111112534231111111111111444444444444444534f // butuh prefix f
    val angkaDouble: Double = 0.1111111111111111111111340934213121213123131312133333333333331341311

    println(angkaFloat)
    println(angkaDouble)
    val f = 7/2.toDouble() // convert ke double menggunakan fungsi to
    
    val i = (1 shl 2) and 0x000FF000 // operasi AND
    print(i)
    println(0)
    println(0.0)
    println(0.00)
    println(-0.00)
    println(Double.POSITIVE_INFINITY)
    println(Double.NEGATIVE_INFINITY)
    println(Double.NaN)

    // Pair dan Triple
    val koordinat : Pair<Int, Int> = Pair(2,3) // key dan value bisa jenis apa saja
    val koordinat2 = Pair(2,3)
    val koordinat3 = 2 to 3

    val stringkey : Pair<String, Int> = Pair("hehe", 3)

    val x1 = koordinat.first // ambil key pada Pair
    val x2 = koordinat.second // ambil value pada Pair
    
    val (x3, y3) = koordinat // inisialisasi 2 variable berdasarkan Pair
    val (_, y5) = koordinat // ambil hanya satu nilai (underscore)

    // Triple sama, namun bedanya pair menyimpan dua nilai triple tiga nilai

    // Any, Unit, Nothing
    var anyNumber : Any = 42
    anyNumber = "hoho"
    println(anyNumber)

    // Unit tidak mengembalikan nilai = method void pada java

    // Nothing biasanya dilakukan untuk looping
    
}