package functions

fun main() {
    println("Message: ")
    val message = readln()
    println(message.clearSpaces())
}

fun String.clearSpaces(): String {
    return this.trim()
}