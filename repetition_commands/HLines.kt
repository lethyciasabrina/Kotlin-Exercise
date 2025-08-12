package repetition_commands

fun main() {
    print("Height: ")
    val h = readln().toInt()
    for (i in 1..h) {
        repeat(i) {
            print("*")
        }
        println()
    }
}