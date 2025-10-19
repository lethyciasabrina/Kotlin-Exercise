package collections

data class Order(
    val id: Int,
    val item: String,
    val price: Double,
    val isDelivered: Boolean
)

val orderList = listOf(
    Order(101, "Coffee Maker", 75.0, true),
    Order(102, "Coffee Grinder", 45.0, false),
    Order(103, "Espresso Beans", 22.5, true),
    Order(104, "Mug Set", 30.0, false),
    Order(105, "Syrup Bottle", 15.0, true),
)

fun main() {
    while (true) {
        println(
            "Choose an option: \n1. Filter by Delivery Status " +
                    "\n2. Map Item Names by Minimum Price \n0. Exit"
        )
        when (readln().toIntOrNull()) {
            1 -> filterByDelivery(orderList)
            2 -> mapToItems(orderList)
            0 -> {
                println("Goodbye!")
                return
            }

            else -> println("Invalid Option.")
        }
    }
}

fun filterByDelivery(orders: List<Order>) {
    print("Show delivered orders (Y/N): ")
    val choose = readln().lowercase()
    if (choose.length != 1 || !choose[0].isLetter()) {
        println("Invalid Operation")
    } else {
        if (choose == "y") {
            val isDelivered = orders.filter { it.isDelivered }
            println("Delivered items: $isDelivered")
        } else {
            val notDelivered = orders.filter { !it.isDelivered }
            println("Was not delivered items: $notDelivered")
        }
    }
}

fun mapToItems(orders: List<Order>) {
    print("Enter a minimum price: ")
    try {
        val minimumPrice = readln().toDouble()
        val highValueItems = orders
            .filter { it.price >= minimumPrice }
            .map { it.item }
        println(highValueItems)
    } catch (_: NumberFormatException) {
        println("ERROR: Please, enter a valid number! (e.g, 50.0).")
    }
}