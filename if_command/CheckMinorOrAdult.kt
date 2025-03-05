package if_command

fun main() {
    println("Enter your age: ")
    val age = readln().toInt()
    if (age < 18) {
        println("Smaller")
    } else {
        println("Adult")
    }
}