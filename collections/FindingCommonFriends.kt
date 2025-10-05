package collections

fun main() {
    val friends = mutableSetOf<String>()
    val otherFriends = mutableSetOf<String>()
    while (true) {
        print("Friends (type 'next' to continue): ")
        val input = readln()
        if (input.equals("next", ignoreCase = true)) {
            break
        } else {
            friends.add(input)
        }
    }
    while (true) {
        print("Friends (type 'done' to exit): ")
        val input = readln()
        if (input.equals("done", ignoreCase = true)) {
            break
        } else {
            otherFriends.add(input)
        }
    }
    println("Friends: ${friends.intersect(otherFriends)}")
}