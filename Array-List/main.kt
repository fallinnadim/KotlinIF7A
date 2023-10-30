// Array dan List

// Array -> Statis
// List -> Dinamis ukurannya

// List -> Interface
fun main() {
    val angkaGenap = arrayOf(2, 4, 6, 8)

    val limaAngka5 = Array(5, {5})

    val hurufVokal = arrayOf("a", "i", "u", "e", "o")

    val angkaGanjil = intArrayOf(1, 3, 5, 7) // array tipe primitif
    println(angkaGanjil)
    angkaGanjil[0] = 17
    println(angkaGanjil)
    // IntArray -> Primitif
    // Array<Int> 

    val zeros = DoubleArray(4)
    val angkaGanjil2 = arrayOf(1, 3, 5, 7).toIntArray()

    for (angka in angkaGanjil2) {
        println(angka)
    }

    angkaGanjil.forEach { // variable bawaan it
        hehe -> println(hehe) 
    }

    val innerPlanets = listOf("Mercury", "Venus", "Earth", "Mars") // List<String>
    val innerPlanetsArrayList = arrayListOf("Mercury", "Venus", "Earth", "Mars") // ArrayList<String>

    val x: List<String> = listOf() // inisialisasi list kosong
    

    // val x = listOf<String>() // cara kedua
    val asdf = mutableListOf<String>()
    val outerPlanets = mutableListOf("Jupiter", "Saturn", "Uranus", "Neptune") // nilainya bisa berubah
    // val outerPlanets = mutableListOf<String>()

    if (outerPlanets.size < 2) {
        println("Outer planet kurang dari 2")
    }
    else {
        println("Outer planet lebih besar atau sama dengan 2")
    }

    println(outerPlanets.first()) // index pertama
    println(outerPlanets.last()) // index terakhir

    val containsPlanet = outerPlanets.let {
        println("${outerPlanets.contains("Uranus")}") // contains = true atau false
    }
    println("Nama Planet 1 : ${outerPlanets[0]}")
    println("Nama Planet 2 : ${outerPlanets[1]}")
    println("Nama Planet 3 : ${outerPlanets[2]}")
    println("Nama Planet 4 : ${outerPlanets[3]}")

    println("Nama Planet 1 : ${outerPlanets.get(0)}")
    println("Nama Planet 2 : ${outerPlanets.get(1)}")
    println("Nama Planet 3 : ${outerPlanets.get(2)}")
    println("Nama Planet 4 : ${outerPlanets.get(3)}")

    // operator slice 
    val filterPlanet = innerPlanets.slice(1..2) // ambil array pada elemen 1 sampai 2
    println(filterPlanet.joinToString(" | ")) // pemisah elemen |

    fun isEliminated(planet: String): Boolean {
        return planet !in outerPlanets // not in
    }

    println(isEliminated("Pluto"))

    println(outerPlanets.slice(1..3).contains("Saturn"))

    // Menambahkan elemen dengan menggunakan add()
    outerPlanets.add("Hohohoho")

    // cara kedua
    outerPlanets += "Hehehehe" 

    println(outerPlanets.joinToString(" || "))

    // Menghapus elemen dengan menggunakan remove()
    outerPlanets.remove("Hehehehe")
    println(outerPlanets.joinToString(" || "))

    // Replace elemen
    outerPlanets[2] = "Bukan Sebuah Planet"
    println(outerPlanets.joinToString(" || "))

    // Sorting berdasarkan abjad kalau string (ascending)
    outerPlanets.sort()
    println(outerPlanets.joinToString(" || "))

    // Remove elemen berdasarkan index
    outerPlanets.removeAt(1)
    println(outerPlanets.joinToString(" || "))


}