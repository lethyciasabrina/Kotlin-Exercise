package functions

fun main() {
    val friends = mutableSetOf<String>()
    val otherFriends = mutableSetOf<String>()
    while (true) {
        println("Friends (type 'next' to continue): ")
        val myFriends = readln()
        friends.add(myFriends)
        if (myFriends.equals("next", ignoreCase = true)) {
            while (true) {
                println("Type your other friends (type 'done' to exit): ")
                val myOtherFriends = readln()
                otherFriends.add(myOtherFriends)
                if (myOtherFriends.equals("done", ignoreCase = true)) {
                    val intersectFriends = friends.intersect(otherFriends)
                    println("Friends: $intersectFriends")
                    break
                }
            }
            break
        } else {
            continue
        }
    }
}