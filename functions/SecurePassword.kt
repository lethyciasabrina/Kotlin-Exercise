package functions

fun main() {
    println("Password: ")
    val password = readln()
    println(securePassword(password))
}

fun securePassword(password: String): Boolean {
    return password.length >= 8 && password.any { it.isDigit() }
}