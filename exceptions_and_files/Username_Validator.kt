package exceptions_and_files

fun main() {
    print("Username: ")
    val username = readln()
    print("Your username is ${isValidUsername(username)}")
}

fun isValidUsername(username: String): Boolean {
    val cleanedUsername = username.trim()
    val pattern = Regex("^\\w{5,15}$")
    return pattern.matches(cleanedUsername)
}