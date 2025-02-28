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