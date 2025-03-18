package if_command

fun main() {
    println("Enter the current hour (military time 0 to 23): ")
    val militaryTime = readln().toInt()

    if (militaryTime == 0) {
        println("Midnight")
    } else if (militaryTime >= 1 && militaryTime <= 11) {
        println("Morning")
    } else if (militaryTime == 12) {
        println("Noon")
    } else if (militaryTime >= 13 && militaryTime <= 17) {
        println("Afternoon")
    } else if (militaryTime >= 18 && militaryTime <= 20) {
        println("Evening")
    } else if (militaryTime >= 21 && militaryTime <= 23) {
        println("Night")
    } else {
        println("Invalid Operation!")
    }
}