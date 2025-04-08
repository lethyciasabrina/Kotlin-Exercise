package if_command

fun main() {
    println("Type the quantity of a product: ")
    val quantity = readln().toDoubleOrNull()

    if (quantity == null || quantity < 0) {
        println("Invalid operation!")
    } else {
        var unitPrice = 0.0
        if (quantity < 5) {
            unitPrice = 1.50
        } else if (quantity < 10) {
            unitPrice = 1.45
        } else if (quantity < 50) {
            unitPrice = 1.40
        } else if (quantity < 100) {
            unitPrice = 1.30
        } else {
            unitPrice = 1.20
        }
        println("Total price: ${unitPrice * quantity}")
    }
}