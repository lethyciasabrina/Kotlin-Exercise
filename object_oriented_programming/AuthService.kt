package object_oriented_programming

class AuthService {
    private var currentToken: String? = null

    private fun loginAccess(user: String) {
        println("User $user just logged in!")
    }

    fun login(user: String, token: String) {
        currentToken = token
        loginAccess(user)
        println("Token stored.")
    }

    fun logout() {
        currentToken = null
        println("Logout successful! Token removed.")
    }

    fun isLoggedIn(): Boolean {
        if (currentToken != null) {
            println("User is logged in.")
            return true
        } else {
            println("User is not logged in.")
            return false
        }
    }

}

fun main() {
    val authService = AuthService()
    while (true) {
        println("Choose an option: \n1 - Login \n2 - Logout \n3 - Check login status \n0 - Exit")
        val option = readln().toInt()
        when (option) {
            1 -> {
                print("Username: ")
                val user = readln()
                print("Token: ")
                val token = readln()
                authService.login(user, token)
            }

            2 -> {
                authService.logout()
            }

            3 -> {
                authService.isLoggedIn()
            }

            0 -> {
                println("In closing...")
                break
            }

            else -> {
                println("Invalid option. Please try again.")
            }
        }
    }
}