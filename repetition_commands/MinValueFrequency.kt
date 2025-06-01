package repetition_commands

fun main() {
    var min: Double? = null
    var frequency = 0
    do {
        println("Numbers: ")
        val flag = readln()
        if (flag.isNotEmpty()) {
            val number = flag.toDouble()
            if (min == null || number < min) {
                min = number
                frequency = 1
            } else if (number == min) {
                frequency++
            }
        }
    } while (flag.isNotEmpty())
    println("Smallest: $min, Frequency: $frequency")
}