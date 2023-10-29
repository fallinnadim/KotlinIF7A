// Materi UTS
// 1. Function
// 2. Nullability
// 3. Collection -> list, set, map, array
// 4. Class -> Attribute dan Method

fun main() {
    // Fold dan Reduce

    var prices = listOf(1.0, 10.0, 5.00, 6.00)

    // Reduces
    var sum = prices.reduce {a, b -> a + b}

    println(sum)

    // Fold
    // Mirip dengan fungsi reduce, tetapi nilai awalnya bukan dari nilai awal list, tetapi akan diinisialisasi
    var sumFold = prices.fold(0.0) {a, b ->
        a + b
    }
    println(sumFold)

    // Methods
    val numbers = arrayListOf(1, 2, 3)
    numbers.removeAt(numbers.lastIndex)
    println(numbers)

    println(10.plus3())
    println((-10).abs())
    println(100.abs())
    println(MyMath.primeFactor(81))
    println(MyMath.factorial(5))
    println(10.greaterValue(20))
}

// Extension Method -> menambahkan method langsung pada class (bebas)
// setelah nama class gunakan .untuk memberi nama method

// this disini mengacu pada parameter
fun Int.plus3(): Int {
    return this + 3
}

fun Int.abs(): Int =
    if (this < 0) -this
    else this


class MyMath {
    companion object {
        fun factorial(number: Int): Int {
            return (1..number).fold(1){ a,b -> a * b}
        }
    }
}

fun MyMath.Companion.primeFactor(value: Int): List<Int> {
    var remainingValue = value
    var testFactor = 2

    val primes = mutableListOf<Int>()
    while (testFactor * testFactor <= remainingValue) {
        if (remainingValue % testFactor == 0) {
            primes.add(testFactor)
            remainingValue /= testFactor
        } else {
            testFactor += 1
        }
    }
    if(remainingValue > 1) {
        primes.add(remainingValue)
    }
    return primes
}

infix fun Int.greaterValue(otherValue: Int) =
    if (this > otherValue) this
    else otherValue
