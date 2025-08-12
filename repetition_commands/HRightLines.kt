package repetition_commands

fun main() {
    print("Height: ")
    val h = readln().toInt()
    var spaces = h - 1
    var asterisk = 1
    for (i in 1..h) {
        for (i in 1..spaces) {
            print(" ")
        }
        for (i in 1..asterisk) {
            print("*")
        }
        println()
        spaces--
        asterisk++
    }
}