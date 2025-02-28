package basic_operations

fun main() {
    println("Type the buying price: ")
    val buyingPrice = readln().toDouble()
    println("Type the profit percentage")
    val profitPercentage = readln().toDouble()
    println("Type the sales tax: ")
    val salesTaxPercentage = readln().toDouble()

    val profit = buyingPrice * (profitPercentage / 100)
    val salesPrice = buyingPrice + profit
    val salesTax = salesPrice * (salesTaxPercentage / 100)
    val finalSalesPrice = salesPrice + salesTax

    println("Profit: $profit, Sales Tax: $salesTax, Final Sales Price: $finalSalesPrice")
}