package basic_operations

fun main() {
    println("Type a number: ")
    val number = readln().toInt()
    // Number is even if the remainder of the division by 2 is 0.
    if (number % 2 == 0) {
        println("True")
    } else {
        println("False")
    }
}