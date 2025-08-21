package functions

fun main() {
    println(welcomeMessage("Alice"))
    println(welcomeMessage("Pedro", "Nice to meet you"))
}

fun welcomeMessage(name: String, salutation: String = "Hello"): String {
    return "$salutation, $name. Welcome to the system."
}