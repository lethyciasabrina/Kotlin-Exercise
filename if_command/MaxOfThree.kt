package if_command

fun main() {
    println("Type the number: ")
    val number1 = readln().toInt()
    println("Type the number: ")
    val number2 = readln().toInt()
    println("Type the number: ")
    val number3 = readln().toInt()

    if (number1 > number2 && number3 < number1) {
        println("Highest: $number1")
    } else if (number2 > number3 && number1 < number2) {
        println("Highest: $number2")
    } else if (number3 > number1 && number2 < number3) {
        println("Highest: $number3")
    }
}