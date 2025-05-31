package repetition_commands

fun main() {
    var max1 = 0
    var max2 = 0
    do {
        println("Numbers: ")
        val input = readln()
        if (input.isNotEmpty()) {
            val number = input.toInt()
            if (number > max1) {
                max2 = max1
                max1 = number
            } else if (number > max2) {
                max2 = number
            }
        }
    } while (input.isNotEmpty())
    println("$max1, $max2")
}