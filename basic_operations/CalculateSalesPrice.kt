package basic_operations

fun main() {
    println("Type the buying price: ")
    val buyingPrice = readln().toDouble()
    println("Type the profit percentage")
    val profitPercentage = readln().toDouble()
    val profit = buyingPrice * (profitPercentage / 100)
    val salesPrice = buyingPrice + profit
    println("Sales Price: $salesPrice, Profit: $profit")
}

/*  Sales price = Buying price * Profit percentage (80 / 100)
    Sales price = Buying price + Profit percentage
    ----------------------------
    Sales price = 5 * (80 / 100)
    Sales price = 5 * 0.8
    Sales price = 5 + 4
    Sales price = 9
*/