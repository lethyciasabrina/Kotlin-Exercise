package exceptions_and_files

fun main() {
    print("Password: ")
    val password = readln()
    println("Valid Password? ${isValidPassword(password)}")
}

fun isValidPassword(password: String): Boolean {
    val cleanedPassword = password.trim()
    val pattern = Regex("""(?=.*[A-Z])(?=.*\d)(?=.*\W).{8,}""")
    return pattern.matches(cleanedPassword)
}