import exceptions.BrokenEngineException
import exceptions.OutOfFuelException
import exceptions.SpaceToEarthConnectionFailedException
import java.lang.Exception

class SpaceCraft {
    private var fuel:Int = 0
    private var isEngineInOrder:Boolean = false
    private var isConnectionAvailable:Boolean = false
    var isInSpace:Boolean = false
    fun launch() {
        if (fuel < 5) {
            // throw exception
            throw OutOfFuelException()
        }
        if (!isEngineInOrder) {
            throw BrokenEngineException()
        }
        if (!isConnectionAvailable) {
            throw SpaceToEarthConnectionFailedException()
        }
        sendMessageToEarth("Trying to launch ...")
        fuel -= 5
        sendMessageToEarth("I`m in space!")
        sendMessageToEarth("I`ve found some extraterrestrials")
        isInSpace = true
    }

    fun refuel() {
        fuel += 5
        sendMessageToEarth("The fuel tank is filled")
    }

    fun repairEngine() {
        isEngineInOrder = true
        sendMessageToEarth("The engine is in order")
    }

    fun fixConnection() {
        isConnectionAvailable = true
        sendMessageToEarth("Hello Earth can you hear me ?")
        sendMessageToEarth("Connection is established")
    }

    fun land() {
        sendMessageToEarth("Landing ...")
        isInSpace = false
    }

    fun sendMessageToEarth(message: String) {
        println("Spacecraft to Earth : $message")
    }
}