package collections

fun main() {
    val visitorsName = mutableSetOf<String>()
    while (true) {
        println("Enter the visitors name (type 'done' to exit): ")
        val name = readln()
        if (name.equals("done", ignoreCase = true)) {
            break
        } else {
            visitorsName.add(name)
        }
    }
    println("Total unique visitors: ${visitorsName.size}\nNames: $visitorsName")
}