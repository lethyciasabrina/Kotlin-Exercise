package basic_operations

fun main() {
    println("Type a temperature in Celsius: ")
    val celsius = readln().toDouble()
    val fahrenheit = (celsius * 1.8 + 32)
    println("Fahrenheit: $fahrenheit")
}

/*  F = C * 1.8 + 32
    F = 28 * 1.8 + 32
    F = 82.4 (Double)
*/