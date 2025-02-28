package basic_operations

fun main() {
    println("Enter the first product: ")
    val firstProduct = readln()
    println("Type the quantity: ")
    val firstProductQuantity = readln().toInt()
    println("Type the unit price: ")
    val firstProductUnitPrice = readln().toDouble()
    println("Enter the second product: ")
    val secondProduct = readln()
    println("Type the quantity: ")
    val secondProductQuantity = readln().toInt()
    println("Type the unit price: ")
    val secondProductUnitPrice = readln().toDouble()
    println("Enter the third product: ")
    val thirdProduct = readln()
    println("Type the quantity: ")
    val thirdProductQuantity = readln().toInt()
    println("Type the unit price: ")
    val thirdProductUnitPrice = readln().toDouble()

    val firstProductTotal = firstProductUnitPrice * firstProductQuantity
    val secondProductTotal = secondProductUnitPrice * secondProductQuantity
    val thirdProductTotal = thirdProductUnitPrice * thirdProductQuantity
    val orderAmount = firstProductTotal + secondProductTotal + thirdProductTotal
    val salesTax = 0.12
    val totalSalesTax = orderAmount * salesTax
    val totalOrderAmount = orderAmount + totalSalesTax

    println("Total sales tax: $totalSalesTax, Total order amount: $totalOrderAmount")
}