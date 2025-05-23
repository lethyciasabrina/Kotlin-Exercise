package repetition_commands

fun main() {
    println("Enter a number: ")
    val min = readln().toInt()
    println("Enter another number: ")
    val max = readln().toInt()

    if (min < max) {
        for (numbers in min..max) {
            if (numbers % 2 == 0) {
                print("$numbers ")
            }
        }
    } else {
        for (numbers in min downTo max) {
            if (numbers % 2 == 0) {
                print("$numbers ")
            }
        }
    }
}