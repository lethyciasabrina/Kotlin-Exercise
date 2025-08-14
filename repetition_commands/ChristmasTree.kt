package repetition_commands

fun main() {
    print("Height: ")
    val h = readln().toInt()
    var spaces = h - 1
    var leafs = 1
    val trunk = h / 2

    for (row in 1..h) {
        for (space in 1..spaces) {
            print(" ")
        }
        if (row == 1) {
            print("*")
        } else {
            for (i in 1..leafs) {
                print(".")
            }
        }
        println()
        spaces--
        leafs += 2
    }
    for (i in 1..trunk) {
        for (space in 1..(h - 1)) {
            print(" ")
        }
        print("|")
        println()
    }
}