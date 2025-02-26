package basic_operations

fun main() {
    println("Type the base: ")
    val base = readln().toDouble()

    println("Type the length: ")
    val length = readln().toDouble()

    val area = (base * length)

    println("Area: $area cm")
}