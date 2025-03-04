package if_command

fun main() {
    println("Enter a number: ")
    val number = readln().toInt()

    if (number > 0) {
        println("$number is positive")
    } else {
        println("$number is negative")
    }
}