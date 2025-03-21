package if_command

fun main() {
    println("Type a letter: ")
    val letter = readln()

    if (letter == "a" || letter == "A" || letter == "e" || letter == "E" ||
        letter == "i" || letter == "I" || letter == "o" || letter == "O" ||
        letter == "u" || letter == "U"
    ) {
        println("Vowel")
    } else if (letter == "B" || letter == "b" || letter == "c" || letter == "C" ||
        letter == "d" || letter == "D" || letter == "f" || letter == "F" || letter == "g" ||
        letter == "G" || letter == "h" || letter == "H" || letter == "j" || letter == "J" ||
        letter == "k" || letter == "K" || letter == "L" || letter == "l" || letter == "m" ||
        letter == "M" || letter == "n" || letter == "N" || letter == "p" || letter == "P" ||
        letter == "q" || letter == "Q" || letter == "R" || letter == "r" || letter == "s" ||
        letter == "S" || letter == "T" || letter == "t" || letter == "v" || letter == "V" ||
        letter == "w" || letter == "W" || letter == "x" || letter == "X" || letter == "Y" ||
        letter == "y" || letter == "z" || letter == "Z"
    ) {
        println("Consonant")
    } else {
        println("Invalid Operation!")
    }
}