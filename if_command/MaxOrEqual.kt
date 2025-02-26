package if_command

fun main() {
    println("Type a number: ")
    val number1 = readln().toInt()
    println("Type another number: ")
    val number2 = readln().toInt()

    if (number1 > number2) {
        println(number1)
    } else if (number1 == number2) {
        println("EQUALS")
    } else {
        println(number2)
    }
}