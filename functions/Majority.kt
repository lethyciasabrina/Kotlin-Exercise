package functions

val people = mutableListOf<Pair<String, Int>>()

fun main() {
    while (true) {
        print("Enter a name (type 'exit' to finish): ")
        val name = readln()
        if (name.equals("exit", ignoreCase = true)) {
            break
        }
        print("Enter an age: ")
        val ageInput = readln()
        try {
            val age = ageInput.toInt()
            people.add(Pair(name, age))
        } catch (_: NumberFormatException) {
        }
    }
    val person = people.filter { it.second >= 18 }
    println("People of legal age: ")
    for ((name, age) in person) {
        println("Name: $name, Age: $age")
    }
}