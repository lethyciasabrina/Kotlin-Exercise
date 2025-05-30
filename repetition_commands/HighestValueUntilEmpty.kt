package repetition_commands

fun main() {
    var max: Double? = null
    do {
        println("Enter a number: ")
        val flag = readln()
        if (flag.isNotEmpty()) {
            val number = flag.toDouble()
            if (max == null || number > max) {
                max = number
            }
        }
    } while (flag.isNotEmpty())
    println("Highest: $max")
}