package basic_operations

fun main() {
    println("Type the first number: ")
    val number1 = readln().toInt()

    println("Type the second number: ")
    val number2 = readln().toInt()

    println("Type the third number: ")
    val number3 = readln().toInt()

    val average = (number1 + number2 + number3) / 3

    println("Average: ${average.toDouble()}")
}