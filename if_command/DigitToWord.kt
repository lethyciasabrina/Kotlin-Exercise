package if_command

fun main() {
    println("Type a number: ")
    val number = readln().toInt()

    if (number < 0 || number > 9) {
        println("Invalid Operation!")
    } else {
        if (number == 0) {
            println("Number zero")
        } else if (number == 1) {
            println("Number one")
        } else if (number == 2) {
            println("Number two")
        } else if (number == 3) {
            println("Number three")
        } else if (number == 4) {
            println("Number four")
        } else if (number == 5) {
            println("Number five")
        } else if (number == 6) {
            println("Number six")
        } else if (number == 7) {
            println("Number seven")
        } else if (number == 8) {
            println("Number eight")
        } else if (number == 9) {
            println("Number nine")
        }
    }
}