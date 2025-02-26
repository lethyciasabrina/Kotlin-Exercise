package basic_operations

fun main() {
    println("Type an integer number: ")
    val number = readln().toInt()

    println("Predecessors: ${number - 3}, ${number - 2}, ${number - 1}")
    println("Successors: ${number + 1}, ${number + 2}, ${number + 3}")
}