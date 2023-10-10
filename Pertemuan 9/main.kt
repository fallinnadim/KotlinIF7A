fun main() {
    // Map & Set
    // Map<K, V>
    var tahunKelahiran = mapOf(
        "Anna" to 1990,
        "Brian" to 1991,
        "Charlie" to 1992,
        "Donna" to 1993,
        )
        // akses value
    println(tahunKelahiran["Anna"]) // akses value
    println(tahunKelahiran.get("Banana")) //nilai akan null apabila key tidak ditemukan
    var skorGame = mutableMapOf("Anna" to 2, "Brian" to 2) // bisa dirubah valuenya
    skorGame["Anna"] = 3
    println(skorGame["Anna"])

    skorGame = mutableMapOf() // membuat map kosong
    var pairs = HashMap<String, Int>() // membuat map kosong baru
    pairs = HashMap<String, Int>(1) // membuat map dengan kapasistas
    pairs["hoho"] = 1
    pairs["hihi"] = 2
    println(pairs)

    // fungsi map
    println(skorGame.isEmpty())
    println(skorGame.size)

    var bobData = mutableMapOf("name" to "Bob", "profession" to "CardPlatyer")
    // menmbah key dan value pada mutablemap
    bobData.put("NewKey", "hehe")
    bobData["NewKey2"] = "hehe"
    println(bobData)

    // menggunakan operator infix += untuk menambahkan pasangan key/value baru
    var pairData = "nickname" to "Bobby D"
    bobData += pairData
    println(bobData)

    // removing pairs
    bobData.remove("NewKey")

    // for-in
    for ((k, v) in bobData) { // bisa menggunakan underscore (_) untuk variable yang tidak pakai
        println("Data memiliki key ${k} dengan nilai ${v}")
    }

    // Set -> himpunan dengan nilai unik
    val names = setOf("Anna", "Brian", "Charlie", "Anna")
    println(names)
    // Generate Set kosong
    val hashSet = HashSet<Int>() 
    // Mutable set
    val bilBulatArray = arrayOf(1, 2, 3, 1)
    // Ubah array jadi set
    val bilBulatSet = mutableSetOf(*bilBulatArray) // spread operator
    println(bilBulatSet)

    // menggunakan contains untuk mencari nilai pada set
    println(bilBulatSet.contains(4)) // false

    // menggunakan in untuk mencari nilai pada set
    println(4 in bilBulatSet) // false

    // menambahkan elemen
    bilBulatSet.add(5)
    println(bilBulatSet)

    // menghapus elemen
    bilBulatSet.remove(5) // bisa dimasukan ke variabel untuk cek apakah berhasil remove atau tidak
    val removed = bilBulatSet.remove(7)
    println(bilBulatSet)
    println(removed)
    
}