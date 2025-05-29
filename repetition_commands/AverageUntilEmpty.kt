package repetition_commands

fun main() {
    var sum = 0.0
    var count = 0.0
    var average = 0.0
    do {
        println("Enter a number: ")
        val flag = readln()
        if (flag.isNotEmpty()) {
            sum += flag.toDouble()
            count += 1
        } else if (count > 0) {
            average = sum / count
        }
    } while (flag.isNotEmpty())
    println(average)
}