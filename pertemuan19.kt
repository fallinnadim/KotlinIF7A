// interface
// Semua attritbut dan methodnya abstract
// Tanpa nilai dan harus diimplementasi

interface Vehicle {
    fun accelerate()
    fun stop()
}
interface DirectionalVehicle {
    fun accelerate()
    fun stop()
    fun turn(direction: Direction = Direction.LEFT)
    fun description(): String
}

interface Wheeled {
    val numberOfWheels: Int
    val wheelSize: Double
}

interface VehicleProperties {
    val weight: Int
    val name: String
        get() = "Vehicle"
}

interface SpaceVehicle {
    fun accelerate()
    fun stop() {
        println("Slow down")
    }
}

// Solusi untuk multiple inheritance
class Tricycle : Wheeled, Vehicle {
    override fun stop() {
        TODO("Not yet implemented")
    }

    override fun accelerate() {
        TODO("Not yet implemented")
    }
    override val numberOfWheels: Int
        get() = TODO("Not yet implemented")
    override val wheelSize: Double
        get() = TODO("Not yet implemented")
}

class Contoh : DirectionalVehicle {
    override fun accelerate() {
        println("Accelerate")
    }

    override fun stop() {
        println("Stop")
    }

    override fun turn(direction: Direction) {
        println(direction.name)
    }

    override fun description(): String {
        return "Hehe"
    }
}

enum class Direction {
    LEFT, RIGHT
}

class Unicycle : Vehicle {
    var peddling = false
    override fun accelerate() {
        peddling = true
    }
    override fun stop() {
        peddling = false
    }
}

class Car : VehicleProperties {
    override val weight: Int
        get() = 1000
}

class Tank : VehicleProperties {
    override val weight: Int
        get() = 1000
    override val name: String
        get() = "Tank"
}

fun main() {
    val unicycle = Unicycle()
    println(unicycle.peddling)
    unicycle.accelerate()
    println(unicycle.peddling)

    val contoh = Contoh()
    contoh.turn()
    contoh.turn(Direction.RIGHT)
}

