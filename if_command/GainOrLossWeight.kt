package if_command

fun main() {
    println("Enter your name: ")
    val name = readln()
    println("Enter your weight: ")
    val currentWeight = readln().toDouble()
    println("Enter your height: ")
    val height = readln().toDouble()
    println("Enter your gender: ")
    val gender = readln().uppercase()

    if (height < 0 || height > 2.5 || gender.length != 1 || !gender[0].isLetter()) {
        println("Invalid Operation")
    } else {
        val idealWeight: Double
        if (gender == "F") {
            idealWeight = (62.1 * height) - 44.7
        } else if (gender == "M") {
            idealWeight = (72.7 * height) - 58
        } else {
            println("I don't have a formula for the given gender.")
            return
        }
        println("Hi $name, your ideal weight is ${"%.2f".format(idealWeight)}kg.")
        if (currentWeight > idealWeight) {
            val loseWeight = currentWeight - idealWeight
            println("You're overweight and need to lose ${"%.2f".format(loseWeight)}kg.")
        } else if (currentWeight < idealWeight) {
            val gainWeight = idealWeight - currentWeight
            println("You're underweight and need to gain ${"%.2f".format(gainWeight)}kg.")
        } else {
            println("You look great, congrats! :) ")
        }
    }
}