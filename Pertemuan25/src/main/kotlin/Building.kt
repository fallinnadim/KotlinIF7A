import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Building(val name: String, var floors: Int = 0, private val scope: CoroutineScope) {
    // suspend keyword agar dipanggil secara asynchronus
    suspend fun makeFoundation() = scope.launch{
        delay(300)
        speak("[${Thread.currentThread().name}] The Foundation is ready")
    }
    suspend fun buildFloor(floor: Int) = scope.launch{
        delay(300)
        speak("[${Thread.currentThread().name}] Floor number $floor is built")
        ++floors
    }
    suspend fun placeWindows(floor: Int) = scope.launch{
        delay(100)
        speak("[${Thread.currentThread().name}] Windows are placed on floor number $floor")
    }

    suspend fun installDoors(floor: Int) = scope.launch{
        delay(100)
        speak("[${Thread.currentThread().name}] Doors are installed on floor number $floor")
    }

    suspend fun buildRoof() = scope.launch{
        delay(200)
        speak("[${Thread.currentThread().name}] The roof is ready")
    }
    suspend fun provideElectricity(floor: Int) = scope.launch{
        delay(200)
        speak("[${Thread.currentThread().name}] Electricity is provided on floor number $floor")
    }
    suspend fun fitOut(floor: Int) = scope.launch{
        delay(200)
        speak("[${Thread.currentThread().name}] Flor number $floor is furnished")
    }
    fun speak(message: String) = println(message)

}