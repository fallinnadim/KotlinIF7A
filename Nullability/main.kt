// null exception
// variabel boleh bernilai null
// semua tipe data boleh null

fun main () {
    var name = "Jafar Doe"
    var age = 24
    var occupation = ""
    // Sentinel Value
    // var errorCode = 0


    var errorCode: Int? // nullable Int
    errorCode = null  // set nilai menjadi null

    // Checking for null
    var result: Int? = 30
    println(result!! + 1) // operator not-null assertion !!, untuk melakukan operasi aritmatika pada nullable Int

    var authorName: String? = "Kotaro Minami"
    var authorAge: Int? = 24
    val ageAfterBirthday = authorAge!! + 1
    println("After next birthday, author will be ${ageAfterBirthday}")

    // not null assertion hanya untuk variable dengan nilai selain null

    // Null checking dengan Smart Casts, safe call, let function, elvis operator

    // Smart Casts
    var nonNullableAuthor: String
    var nullableAuthor: String?

    if (authorName != null) nonNullableAuthor = authorName
    else nullableAuthor = authorName

    // Safe Call
    // Operator ?. digunakan untuk mengecek apakah nilainya null atau tidak
    // bisa dilakukan chain function selama nilainya tidak null
    authorName = "Takeo Ischi"
    var nameLength = authorName?.length
    println("Author`s name has length ${nameLength} .")

    authorName = "hehehe"
    var nameLength2 = authorName?.equals("Takeo Ischi")
    println("Author`s name has length ${nameLength2} .")

    var nameLengthPlus5 = authorName?.length?.plus(5)

    // let() function
    // let() function lebih fleksibel
    authorName?.let {
        println("Gak null kak")
    }

    // Elvis Operator (?:)
    var nullableInt : Int? = null
    var mustHaveResult = nullableInt ?: 13 // assign value dengan nilai 13, jika nilai variable nullableInt = null
    print(mustHaveResult)
}
