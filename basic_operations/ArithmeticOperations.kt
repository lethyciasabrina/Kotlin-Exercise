package basic_operations

fun main() {
    println("Type a number: ")
    val a = readln().toInt()

    println("Type another number: ")
    val b = readln().toInt()

    val sum = a + b
    val subtraction = a - b
    val multiplication = a * b
    val division = a / b
    val rest = a % b

    println("Sum: $sum, Subtraction: $subtraction, " +
            "Multiplication: $multiplication, " +
            "Integer: $division, " +
            "Double: ${division.toDouble()}, " +
            "Rest: $rest"
    )
}
