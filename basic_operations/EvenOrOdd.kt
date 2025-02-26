package basic_operations

fun main() {
    println("Type a number: ")
    val number = readln().toInt()

    if (number % 2 == 0) {
        println("True")
    } else {
        println("False")
    }
}

/*  Even number: Remainder of the division is 0.
    Odd number: Remainder of the division is 1.
*/