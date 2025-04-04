package if_command

fun main() {
    println("Enter your age: ")
    val ageInput = readln()

    val age = ageInput.toIntOrNull()

    if (age == null || age < 0) {
        println("Invalid Operation")
    } else if (age == 0) {
        println("Unborn")
    } else if (age < 1) {
        println("Infant")
    } else if (age <= 12) {
        println("Child")
    } else if (age <= 17) {
        println("Adolescent")
    } else if (age <= 55) {
        println("Adult")
    } else if (age <= 75) {
        println("Senior")
    } else {
        println("Elderly")
    }
}