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

/*  Input: - 3 Description (what is)
           - 3 Quantity
           - 3 Unit price

    Output: - Total sales tax
            - Total order amount
    ---------------------
    1: Apple 1,50 (x3) = 4,50
    2: Banana 0,50 (x12) = 6
    3: Orange 1,0 (x6) = 6

   Order amount = 16,50
   Sales Tax: 12 / 100 = 0,12
   Total Sales Tax: Order amount * Sales tax = 1,98
   Total order amount: Order amount + Total Sales Tax = 18,48
   ---------------------
   1: Blender 150 (x2) = 300
   2: Sandwich maker 80 (x1) = 80
   3: Dishcloth 5 (x10) = 50

   Order amount = 430
   Sales tax: 12 / 100 = 0.12
   Total sales tax: Order amount * Sales tax = 51,60
   Total order amount: Order amount + Total Sales Tax = 481,60
*/