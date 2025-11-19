package object_oriented_programming

abstract class Vehicle(val make: String, val year: Int, val engine: Engine) {
    abstract fun maintenanceCost(): Double
}

class Engine(val enginePower: Int, val isOn: Boolean) {
    fun engineOn() {
        println("The engine is on.")
    }

    fun engineOff() {
        println("The engine is off.")
    }
}

class Car(make: String, year: Int, engine: Engine) : Vehicle(make, year, engine) {
    override fun maintenanceCost(): Double {
        return 300.0
    }
}

class Truck(make: String, year: Int, engine: Engine) : Vehicle(make, year, engine) {
    override fun maintenanceCost(): Double {
        return 300.0 + (engine.enginePower * 0.5)
    }
}

fun main() {
    val vehicles = mutableListOf<Vehicle>()
    while (true) {
        println("Which vehicle needs maintenance? \n1 - Car \n2 - Truck \n0 - Exit")
        val option = readln().toIntOrNull() ?: 0
        if (option == 1 || option == 2) {
            print("Make: ")
            val make = readln()
            print("Year: ")
            val year = readln().toIntOrNull() ?: 0
            print("Engine Power: ")
            val enginePower = readln().toIntOrNull() ?: 0
            val newEngine = Engine(enginePower, false)
            when (option) {
                1 -> {
                    vehicles.add(Car(make, year, newEngine))
                    println("Car $make ($year) added to fleet.")
                }

                2 -> {
                    vehicles.add(Truck(make, year, newEngine))
                    println("Truck $make ($year) added to fleet.")
                }
            }
        } else if (option == 0) {
            println("Closing registration...")
            break
        } else {
            println("Invalid Option.")
        }
    }
    vehicles.forEach { vehicle ->
        vehicle.engine.engineOn()
        val cost = vehicle.maintenanceCost()
        println(
            "Vehicle Make: ${vehicle.make} \nVehicle Year: ${vehicle.year} " +
                    "\nMaintenance Cost: R$%.2f".format(cost)
        )
    }
}