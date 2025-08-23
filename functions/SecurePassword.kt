package functions

fun main() {
    println("Password: ")
    val password = readln()
    println(password.securePassword())
}

fun String.securePassword(): Boolean {
    return this.length >= 8 && this.any { it.isDigit() }
}