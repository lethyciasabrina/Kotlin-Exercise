package if_command

fun main() {
    println("Enter your name: ")
    val name = readln()
    println("Enter your height: ")
    val height = readln().toDouble()
    println("Enter your gender: (F - Female; M - Male): ")
    val gender = readln()

    if (height < 0 || gender.length != 1 || !gender[0].isLetter()) {
        println("Invalid Operation")
    } else {
        var realWeight = 0.0
        if (gender == "F" || gender == "f") {
            realWeight = (62.1 * height) - 44.7
            println("Hi $name, your height is ${height}m and your ideal weight is ${realWeight}kg")
        } else if (gender == "M" || gender == "m") {
            realWeight = (72.7 * height) - 58
            println("Hi $name, your height is ${height}m and your ideal weight is ${realWeight}kg")
        } else {
            println("Invalid gender. Please enter 'M' for male or 'F' for female.")
        }
    }
}