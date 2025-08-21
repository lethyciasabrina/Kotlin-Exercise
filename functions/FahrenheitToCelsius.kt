package functions

fun main() {
    print("Farenheit: ")
    val f = readln().toDouble()
    FarenheitToCelsius(f)
    println("Celsius: ${FarenheitToCelsius(f)}")
}

fun FarenheitToCelsius(f: Double): Double {
    return (f - 32) * 5 / 9
}