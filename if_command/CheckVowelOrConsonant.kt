package if_command

fun main() {
    println("Type a letter: ")
    val letter = readln()

    if (letter.length != 1 || !letter[0].isLetter()) {
        println("Invalid Operation")
    } else {
        val letterLower = letter.lowercase()
        if (letterLower == "a" || letterLower == "e" || letterLower == "i" ||
            letterLower == "o" || letterLower == "u"
        ) {
            println("Vowel")
        } else {
            println("Consonant")
        }
    }
}