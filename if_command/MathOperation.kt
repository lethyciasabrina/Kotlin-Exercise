package if_command

fun main() {
    println("Enter a number: ")
    val number1 = readln().toInt()
    println("Enter another number: ")
    val number2 = readln().toInt()
    println("Choose an operation: 1) +, 2) -, 3) *, 4) /")
    val choose = readln()

    val plus = number1 + number2
    val minus = number1 - number2
    val multipliedBy = number1 * number2
    val dividedBy = number1 / number2

    if (choose == "1") {
        println("$number1 + $number2 = $plus")
    } else if (choose == "2") {
        println("$number1 - $number2 = $minus")
    } else if (choose == "3") {
        println("$number1 * $number2 = $multipliedBy")
    } else if (choose == "4") {
        println("$number1 / $number2 = $dividedBy")
    }
}