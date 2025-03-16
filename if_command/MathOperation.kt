package if_command

fun main() {
    println("Enter a number: ")
    val number1 = readln().toInt()
    println("Enter another number: ")
    val number2 = readln().toInt()
    println("Choose an operation: +, -, * or /")
    val operation = readln()

    if (operation == "+") {
        println("$number1 + $number2 = ${number1 + number2}")
    } else if (operation == "-") {
        println("$number1 - $number2 = ${number1 - number2}")
    } else if (operation == "*") {
        println("$number1 * $number2 = ${number1 * number2}")
    } else if (operation == "/") {
        if (number2 == 0) {
            println("Invalid Operation! Division by 0")
        } else {
            println("$number1 / $number2 = ${number1 / number2}")
        }
    } else {
        println("Invalid Operation.")
    }
}