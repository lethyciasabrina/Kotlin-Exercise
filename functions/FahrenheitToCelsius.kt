package functions

fun main() {
    print("Farenheit: ")
    val f = readln().toDouble()
    val celsius = farenheitToCelsius(f)
    println("Celsius: $celsius")
}

fun farenheitToCelsius(f: Double): Double {
    return (f - 32) * 5 / 9
}