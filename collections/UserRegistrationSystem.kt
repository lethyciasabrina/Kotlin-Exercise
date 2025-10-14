package collections

data class UserProfile(
    val name: String,
    val email: String,
    val age: Int,
    val city: String
)

val userRegistry = mutableMapOf<String, UserProfile>()

fun main() {
    while (true) {
        println(
            "Please, take an option: \n1 - Register User \n2 - Find User " +
                    "\n3 - List Users \n4 - Exit"
        )
        val option = readln().toInt()
        when (option) {
            1 -> registerUser()
            2 -> findUser()
            3 -> listAllUsers()
            4 -> break
        }
    }
}

fun registerUser() {
    print("Enter your name: ")
    val nameInput = readln()
    print("Enter your username: ")
    val usernameInput = readln()
    print("Enter your email: ")
    val emailInput = readln()
    print("Enter your age: ")
    val ageInput = readln().toInt()
    print("Enter your city: ")
    val cityInput = readln()
    val newRegisterObject = UserProfile(
        name = nameInput,
        email = emailInput,
        age = ageInput,
        city = cityInput
    )
    userRegistry[usernameInput] = newRegisterObject
    println("User registered successfully!")
}

fun findUser() {
    print("Enter the username to search: ")
    val username = readln()
    val retrievedUser = userRegistry[username]
    if (retrievedUser != null) {
        println("Name: ${retrievedUser.name}")
        println("Email: ${retrievedUser.email}")
        println("Age: ${retrievedUser.age}")
        println("City: ${retrievedUser.city}")
    } else {
        println("Error: User '$username' not found in registry.")
    }
}

fun listAllUsers() {
    for (value in userRegistry.values) {
        println("User: ${value.name}")
    }
}