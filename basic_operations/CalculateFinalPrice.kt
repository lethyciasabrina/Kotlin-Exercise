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

/*  Sales price = Buying price * (Profit percentage / 100)
    Sales price = 5 * (80 / 100)
    Sales price = 5 * 0.8
    Sales price = Buying price + Profit percentage 
    Sales price = 5 + 4
    Sales price = 9
    ----------------------------
    Sales tax = Sales price * (Sales tax percentage / 100)
    Sales tax  = 9 * (15 / 100)
    Sales tax  = 9 * 0.15
    Sales tax  = 1.35
    ----------------------------
    Final sales price = Sales price + Sales tax
    Final sales price = 9 + 1.35
    Final sales price = 10.35
*/