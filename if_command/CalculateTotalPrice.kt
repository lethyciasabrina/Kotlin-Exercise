package if_command

fun main() {
    println("Type the quantity of a product: ")
    val quantity = readln().toDoubleOrNull()

    if (quantity == null || quantity < 0) {
        println("Invalid operation!")
    } else {
        val unitPrice = if (quantity < 5) {
            1.50
        } else if (quantity < 10) {
            1.45
        } else if (quantity < 50) {
            1.40
        } else if (quantity < 100) {
            1.30
        } else {
            1.20
        }
        println("Total price: ${unitPrice * quantity}")
    }
}