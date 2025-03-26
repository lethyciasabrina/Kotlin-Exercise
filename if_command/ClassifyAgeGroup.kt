package if_command

fun main() {
    println("Enter your age: ")
    val age = readln().toInt()

    if (age < 0) {
        println("Invalid Operation")
    } else {
        if (age == 0) {
            println("Unborn")
        } else if (age < 9) {
            println("Infant")
        } else if (age < 12) {
            println("Child")
        } else if (age < 17) {
            println("Adolescent")
        } else if (age < 55) {
            println("Adult")
        } else if (age < 75) {
            println("Senior")
        } else {
            println("Elderly")
        }
    }
}