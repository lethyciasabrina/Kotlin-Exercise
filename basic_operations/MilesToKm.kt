package basic_operations

fun main() {
    print("Value in miles: ")
    val miles = readln().toDouble()

    val kilometers = (miles * 1.60934)

    println("$miles miles = $kilometers kilometers")
}