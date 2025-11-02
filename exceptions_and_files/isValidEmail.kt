package exceptions_and_files

fun main() {
    print("Email: ")
    val email = readln()
    println("Is this a valid email address? ${isValidEmail(email)}")
}

fun isValidEmail(email: String): Boolean {
    val cleanedEmail = email.trim()
    val pattern = Regex("""^[a-zA-Z0-9.-]+@[a-zA-Z0-9-]+\.[a-zA-Z]{2,}$""")
    return pattern.matches(cleanedEmail)
}