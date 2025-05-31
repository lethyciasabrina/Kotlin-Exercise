package repetition_commands

fun main() {
    var max1: Double? = null
    var max2: Double? = null
    do {
        println("Numbers: ")
        val input = readln()
        if (input.isNotEmpty()) {
            val number = input.toDouble()
            if (max1 == null) {
                max1 = number
            } else if (number > max1) {
                max2 = max1
                max1 = number
            } else if (max2 == null || number > max2) {
                max2 = number
            }
        }
    } while (input.isNotEmpty())
    println("$max1, $max2")
}