import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class BuildingYard {
    suspend fun startProject(name: String, floors: Int) {
        val building = withContext(Dispatchers.Default) {
            val building = Building(name, scope = this)
            val cores = Runtime.getRuntime().availableProcessors()

            building.speak("The building of $name is started with $cores building machine engaged")
            building.makeFoundation().join() // mengharuskan menunggu co-routine sebelumnya
                                            // baru bisa lanjut ke co-routine berikutnya
            (1..floors).forEach{
                building.buildFloor(it).join()
                building.placeWindows(it)
                building.installDoors(it)
                building.provideElectricity(it)
                building.fitOut(it)
            }
            building.buildRoof().join()
            building // memanggil building untuk mengakhiri proses
        }

        if (building.floors == floors) {
            building.speak("${building.name} is ready")
        }
    }
}