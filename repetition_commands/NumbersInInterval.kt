package repetition_commands

fun main() {
    println("Type a number: ")
    val number1 = readln().toInt()
    println("Type another number: ")
    val number2 = readln().toInt()
    val start = minOf(number1, number2)
    val end = maxOf(number1, number2)
    val range = start..end
    for (numbers in range) {
        if (numbers == number1 || numbers == number2) {
            continue
        }
        print("$numbers ")
    }
}