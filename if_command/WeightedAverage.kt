package if_command

fun main() {
    println("Type your grade 1: ")
    val grade1 = readln().toDouble()
    println("Type your grade 2: ")
    val grade2 = readln().toDouble()
    println("Type your grade 3: ")
    val grade3 = readln().toDouble()

    val weightedAverage = ((30 * grade1) + (30 * grade2) + (40 * grade3)) / (30 + 30 + 40)

    if (grade1 < 0 || grade2 < 0 || grade3 < 0) {
        println("Invalid Operation")
    } else {
        if (grade1 >= 10 && grade2 >= 10 && grade3 >= 10) {
            if (weightedAverage <= 7.5) {
                println("Your Weighted Average is $weightedAverage, you PASS")
            } else {
                println("Sorry, your Weighted Average is $weightedAverage, you FAIL")
            }
        }
    }
}