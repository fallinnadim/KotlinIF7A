import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main () = runBlocking{
    // Asynchronus
    // Multithreading
    // Kotlin Co-Routine
    BuildingYard().startProject("Smart House", 20)

//    launch (Dispatchers.Default){
//        (0..10).forEach{
//            println("Message # $it from ${Thread.currentThread().name}")
//        }
//    }
//    (0..10).forEach{
//        println("Message # $it from ${Thread.currentThread().name}")
//    }

//    thread(start = true, name = "Thread 1") {
//        (0..10).forEach{
//            println("Message # $it from ${Thread.currentThread().name}")
//        }
//    }
//    (0..10).forEach{
//        println("Message # $it from ${Thread.currentThread().name}")
//    }
}