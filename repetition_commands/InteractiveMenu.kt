package repetition_commands

fun main() {
    var order = -1
    var total = 0.0
    while (true) {
        println(
            "Choose an option:\n" +
                    "1 - Pizza (R$25.00)\n" +
                    "2 - Hamburger (R$18.00)\n" +
                    "3 - Soda (R$5.00)\n" +
                    "4 - Juice (R$7.00)\n" +
                    "0 - Exit"
        )
        order = readln().toInt()
        when (order) {
            1 -> total += 25.0
            2 -> total += 18.0
            3 -> total += 5.0
            4 -> total += 7.0
            0 -> {
                println("Final Total: R$$total")
                println("Come back soon! :) ")
                break
            }

            else -> println("Invalid option.")
        }
        println("Partial Total: R$$total")
        println("Do you want to continue? (y/n)")
        if (readln().lowercase() == "n") {
            println("Final total: R$$total")
            println("Come back soon! :) ")
            break
        }
    }
}