package functions

fun main() {
    print("Phone Number: ")
    val phoneNumber = readln()
    println(phoneNumber.phoneChecker())
}

fun String.phoneChecker(): Boolean {
    return this.length >= 11 && this.all { it.isDigit() }
}