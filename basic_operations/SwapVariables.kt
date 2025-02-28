package basic_operations

fun main() {
    println("Enter the first number: ")
    var number1 = readln().toInt()
    println("Enter the second number: ")
    var number2 = readln().toInt()

    val aux = number1
    number1 = number2
    number2 = aux

    println("Num1: $number1, Num2: $number2 ")
}