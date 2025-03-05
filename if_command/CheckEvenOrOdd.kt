package if_command

fun main() {
    println("Enter a number: ")
    val number = readln().toInt()
    val dividedBy = number % 2
    if (dividedBy == 0) {
        println("$number is Even")
    } else {
        println("$number is Odd")
    }
}