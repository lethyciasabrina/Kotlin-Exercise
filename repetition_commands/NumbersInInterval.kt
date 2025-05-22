package repetition_commands

fun main() {
    println("Type a number: ")
    val min = readln().toInt()
    println("Type another number: ")
    val max = readln().toInt()
    if (min < max) {
        for (numbers in min..max) {
            print("$numbers ")
        }
    } else {
        for (numbers in min downTo max) {
            print("$numbers ")
        }
    }
}