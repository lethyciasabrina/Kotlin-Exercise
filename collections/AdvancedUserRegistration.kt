package collections

data class User(
    val age: Int,
    val email: String
)

fun main() {
    val userRegistry = mutableMapOf<String, User>()
    for (i in 1..3) {
        print("Username: ")
        val usernameInput = readln()
        print("Email: ")
        val emailInput = readln()
        print("Age: ")
        val ageInput = readln().toInt()
        // Creating the object
        val newUserObject = User(
            age = ageInput,
            email = emailInput
        )
        // Add to the Map
        userRegistry[usernameInput] = newUserObject
    }
    print("Username to search: ")
    val username = readln()
    // Retrieving and accessing data
    val foundUser = userRegistry[username]
    if (foundUser != null) {
        println("$username's information is: ")
        println("Email: ${foundUser.email}")
        println("Age: ${foundUser.age}")
    } else {
        print("Error. $username is not found")
    }
}