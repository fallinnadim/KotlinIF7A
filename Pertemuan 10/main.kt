fun main() {
    // Lambda Function
    val message = {
        println("Hello World")
    }
    // With Parameter
    val message2 = {pesan: String ->
        println("Hallo ${pesan}")
    }

    // Initialize body function
    var multiply:(Int, Int) -> Int
    multiply = {a: Int, b: Int -> Int
        a*b
    }
    // Short function with 1 parameter
    val square : (Int) -> Int = {it * it}

    // High Order Function (fungsi sebagai parameter pada fungsi lain)
    fun operateOnNumber(a: Int, b: Int, operation: (Int, Int) -> Int) : Int {
        val result = operation(a,b)
        return result
    }

    var addLambda = {nilai1 : Int, nilai2: Int -> 
        nilai1 + nilai2
    }

    fun addFunction(a: Int, b:Int) = a + b
    
    var hasilPenjumlahaLambda = operateOnNumber(10, 5, addLambda)
    
    // cara cepat Lambda function dengan syarat lambda function harus di argumen terakhir
    var hasilPenguranganLambda = operateOnNumber(10, 5){
        a: Int, b: Int -> a - b
    } 

    var hasilFunctionBiasa = operateOnNumber(10, 5, ::addFunction)

    // Sama seperti void pada Java
    val message3:() -> Unit = {
        println("Hello Duniaaaa")
    }

    

    // Call the function
    message()
    message2("hehe")
    println(multiply(2, 3))
    println(hasilPenjumlahaLambda)
    println(hasilPenguranganLambda)
    println(hasilFunctionBiasa)
}