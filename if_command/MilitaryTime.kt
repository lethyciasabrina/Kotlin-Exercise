package if_command

fun main() {
    println("Enter the hour (military time 0 to 23): ")
    val hour = readln().toInt()

    if (hour < 0 || hour > 23) {
        println("Invalid Operation!")
    } else {
        if (hour <= 11) {
            if (hour == 0) {
                println("Midnight")
            } else {
                println("Morning")
            }
        } else if (hour <= 17) {
            if (hour == 12) {
                println("Noon")
            } else {
                println("Afternoon")
            }
        } else {
            println("Night")
        }
    }
}