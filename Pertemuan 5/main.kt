fun main () {
    val closedRange = 0 .. 5
    val openHalfRange = 0 until 5

    val increasingRange = 0.rangeTo(5)
    val decreasingRange = 5 downTo 0
    val rangeWithStep = 0 .. 5 step 2
    val decreasingRange2 = 5.downTo(0)


    val count = 10
    var sum = 0
    for (i in 1 .. count) {
        sum += i
    }
    println(sum)

    sum = 1
    var lastSum = 0
    repeat(10) {
        val temp = sum
        sum += lastSum
        lastSum = temp
    }
    println(sum)
    println(lastSum)
    // REPEAT 1 -> temp = 1, sum = 1, lastSum = 1
    // REPEAT 2 -> temp = 1, sum = 1+1=2, lastSum = 1
    // REPEAT 3 -> temp = 2, sum = 2+1=3, lastSum = 2
    // REPEAT 4 -> temp = 3, sum = 3+2=5, lastSum = 3
    // REPEAT 5 -> temp = 5, sum = 5+3=8, lastSum = 5
    // REPEAT 6 -> temp = 8, sum = 8+5=13, lastSum = 8
    // REPEAT 7 -> temp = 13, sum = 13+8=21, lastSum = 13
    // REPEAT 8 -> temp = 21, sum = 21+13=34, lastSum = 21
    // REPEAT 9 -> temp = 34, sum = 34+21=55, lastSum = 34
    // REPEAT 10 -> temp = 55, sum = 55+34=89, lastSum = 55

    sum = 0
    for (i in 1 .. count step 2) {
        sum += i
    }
    println(sum)
    
    sum = 0
    for (i in count downTo 1 step 2) {
        sum += i
    }
    println(sum)
  

    // label statements -> continue
    sum = 0
    for (row in 0 until 8) {
        if (row % 2 == 0) {
            continue // tidak akan mengeksekusi baris dibawah ini
        }
        for (column in 0 until 8) {
            sum += row * column
        }
    }
    println (sum)
    // 1 -> 1*0 + 1*1 + 1*2 + 1*3 + 1*4 + 1*5 + 1*6 + 1*7 = 0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28
    // 3 -> 3*0 + 3*1 + 3*2 + 3*3 + 3*4 + 3*5 + 3*6 + 3*7 = 0 + 3 + 6 + 9 + 12 + 15 + 18 + 21 =  84
    // 5 -> 5*0 + 5*1 + 5*2 + 5*3 + 5*4 + 5*5 + 5*6 + 5*7 = 0 + 5 + 10 + 15 + 20 + 25 + 30 + 35 = 140
    // 7 -> 7*0 + 7*1 + 7*2 + 7*3 + 7*4 + 7*5 + 7*6 + 7*7 = 0 + 7 + 14 + 21 + 28 + 35 + 42 + 49 = 196

    sum = 0
    rowLoop@ for (row in 0 until 8) {
        columLoop@ for (column in 0 until 8) {
            if (row == column) {
                continue@rowLoop // continue ke baris for yang diinginkan
            }
            sum += row * column
        }
    }
    println(sum)

    val rangesStep3 = 1.rangeTo(10) step 3
    rangesStep3.forEach{ value -> // ganti variable bawaan it dengan value
        println("Angka $value") // variable bawaan it
    }

    // Ekspresi When
    // Contoh 1
    val number = 10
    when (number) {
        0 -> println("Sero")
        else -> println("non-Sero")
    }

    // Contoh 2
    when (number) {
        10 -> println("It`s a ten!")
    }

    // Contoh 3
    val string = "Dog"
    when (string) {
        "Cat", "Dog" -> println("Animal is a house pet")
        else -> println("Animal is a not house pet")
    }

    // Contoh 4 (returning values)
    val numberName = when (number) {
        2 -> "two"
        4 -> "four"
        6 -> "six"
        8 -> "eight"
        10 -> "ten"
        else -> "unknown"
    }
    println(numberName)

    // Contoh lanjutan when
    val hourOfDay = 12
    val timeOfDay = when (hourOfDay) {
        in 0 .. 5 -> "Early Morning"
        in 6 .. 11 -> "Morning"
        in 12 .. 16 -> "Afternoon"
        in 17 .. 19 -> "Evening"
        in 20 .. 23 -> "Late Evening"
        else -> "INVALID HOUR"
    }
    println(timeOfDay)

    // Penggunaan when tanpa kondisi di luar
    when {
        number %2 == 0 -> println("Even")
        else -> println("Odd")
    }
}