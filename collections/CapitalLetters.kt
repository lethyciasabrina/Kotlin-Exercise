package collections

fun main() {
    val names = mutableListOf<String>()
    println("Add names (type 'exit' to finish): ")
    while (true) {
        val inputUser = readln()
        if (inputUser.equals("exit", ignoreCase = true)) {
            break
        } else {
            names.add(inputUser)
        }
    }
    println("Names in uppercase: ${names.map { it.uppercase() }}")
}