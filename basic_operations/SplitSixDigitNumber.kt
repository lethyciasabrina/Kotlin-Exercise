package basic_operations

fun main() {
    println("Enter an integer with 6 digits: ")
    val fullNumber = readln().toInt()

    val left = fullNumber / 1000
    val right = fullNumber % 1000

    println("$left.$right")
}