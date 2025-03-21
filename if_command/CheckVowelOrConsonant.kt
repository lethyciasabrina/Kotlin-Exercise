package if_command

fun main() {
    println("Type a letter: ")
    val letter = readln()

    if (letter == "a" || letter == "e" || letter == "i" || letter == "o" || letter == "u") {
        println("It's a vowel")
    } else {
        println("Consonant")
    }

}