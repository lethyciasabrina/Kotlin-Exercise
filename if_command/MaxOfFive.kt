package if_command

fun main() {
    println("Type the number1: ")
    val number1 = readln().toInt()
    println("Type the number2: ")
    val number2 = readln().toInt()
    println("Type the number3: ")
    val number3 = readln().toInt()
    println("Type the number4: ")
    val number4 = readln().toInt()
    println("Type the number5: ")
    val number5 = readln().toInt()

    var biggest = number1

    if (number2 > biggest) {
        biggest = number2
    }
    if (number3 > biggest) {
        biggest = number3
    }
    if (number4 > biggest) {
        biggest = number4
    }
    if (number5 > biggest) {
        biggest = number5
    }
    println("Biggest: $biggest")
}