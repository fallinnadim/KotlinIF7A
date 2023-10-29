import kotlin.math.*

fun main() {

    //variabel boolean
    val yes: Boolean = true
    val no = false

    //boolean operator
    val oneEqualTwo = (1==2)
    println(oneEqualTwo)

    val oneNotEqualTwo = (1 != 2)
    println(oneNotEqualTwo)

    val alsoTrue = !(1==2)
    println(alsoTrue)

    val oneGreaterThenTwo = (1>2)
    println("onegreaterthantwo" + oneGreaterThenTwo)

    val oneLessThenTwo = (1<2)
    println(oneLessThenTwo)

    //boolean logic
    val operasiAnd = true && true
    val opeariOr = true || true

    println(operasiAnd)
    println(opeariOr)

    val andTrue = 1 < 2 && 4 > 3
    println(andTrue)
    val andFalse = 1 < 2 && 3 > 4
    val orTrue = 1 < 2 || 4 > 3
    val orFalse = 1 == 2 || 3 == 4

    //(1 < 2 && 3 > 4) || 1 < 4
    //(true && false) || true

    // String equality
    val dog = "dog"
    val dogEqualCat = dog == "dog"
    println("dogequalcat" + dogEqualCat)
    val order = "cat" < "dog"
    println("order" + order)

    //ekspresi if
    if (2>1){
        println("Ya, 2 lebih besar dari 1")
    } else{
        println("sok tau lu")
    }

    val animal = "Fox"
    if (animal == "Cat" || animal == "dog"){
        println("Animal is a house pet")
    } else {
        println("Animal is not a house pet")
    }

    //mencari nilai maksimum dan minimum dari 2 nilai
    val a = 5
    val b = 10

    val cari = max(a,b)
    println(cari)

    /*val max:Int
    if (a<b){
        max = a
    } else {
        max = b
    }
    println(max)
    */

    val min = if (a<b) a else b
    val max = if (a>b) a else b
    //int min = (a>b) a else b

    println(min)
    println(max)

    val hourOfDay = 12
    if (hourOfDay < 6){
        "morning"
    } else if (hourOfDay < 17){
        "Afternoon"
    } else if (hourOfDay < 20){
        "Evening"
    } else if (hourOfDay < 23){
        "Lat Evening"
    } else {
        "Invalid hour"
    }

    println("hourofday " + hourOfDay)

    //Loop
    var sum = 1
    while (sum < 1000){
        sum = sum +(sum + 1)
    }
    println(sum)
    //sebelum iterasi 1, sum = 1, condition = true
    //sebelum iterasi 1, sum = 3, condition = true
    //sebelum iterasi 2, sum = 7, condition = true
    //sebelum iterasi 3, sum = 15, condition = true
    //sebelum iterasi 4, sum = 31, condition = true
    //sebelum iterasi 5, sum = 63, condition = true
    //sebelum iterasi 6, sum = 127, condition = true
    //sebelum iterasi 7, sum = 255, condition = true
    //sebelum iterasi 8, sum = 511, condition = true
    //sebelum iterasi 9, sum = 1023, condition = false

    //do-while
    sum = 1
    do{
        sum = sum + (sum + 1)
    } while (sum < 1000)
    println(sum) // 1023

    sum = 1
    while (sum < 1) {
        sum = sum + (sum + 1)
    }
    println(sum) // 1
    // beda while denagn do - while
    // while akan melakukan pengecekan kode dahulu
    // do while akan melakukan do terlebih dahulu baru pengecekan kode
    sum = 1
    do {
        sum = sum + (sum + 1)
    } while (sum < 1)
    println(sum) //3

    //penggunaan break
    sum = 1
    while (true){
        sum = sum + (sum + 1)
        if (sum  >= 1000)
            break
    }
    println(sum) //1023

}