package object_oriented_programming

class ProductStock(val name: String, val code: String) {
    private var stockQuantity: Int = 0

    fun getQuantity(): Int {
        return stockQuantity
    }

    fun recordStockIn(quantity: Int) {
        if (quantity > 0) {
            stockQuantity += quantity
            println("Stock added!")
        } else {
            println("Please, enter a positive number!")
        }
    }

    fun recordStockOut(quantity: Int): Boolean {
        if (stockQuantity > quantity) {
            stockQuantity -= quantity
            println("Stock removed!")
            return true
        } else {
            println("Insufficient stock quantity! \nStock Quantity: $stockQuantity!")
            return false
        }
    }
}

fun main() {
    print("Name: ")
    val name = readln()
    print("Code: ")
    val code = readln()
    val inventoryManagement = ProductStock(name, code)
    println("$name successfully created!")
    while (true) {
        println("Choose an option: \n1 - Increase inventory \n2 - Reduce inventory \n3 - View stock \n0 - Exit")
        val option = readln().toInt()
        when (option) {
            1 -> {
                print("How much do you want to add? ")
                val quantity = readln().toInt()
                inventoryManagement.recordStockIn(quantity)
            }

            2 -> {
                print("How much do you want to remove? ")
                val quantity = readln().toInt()
                inventoryManagement.recordStockOut(quantity)
            }

            3 -> {
                println("Stock Quantity: ${inventoryManagement.getQuantity()}")
            }

            0 -> {
                println("In closing...")
                break
            }

            else -> {
                println("Invalid option. Please try again.")
            }
        }
    }
}