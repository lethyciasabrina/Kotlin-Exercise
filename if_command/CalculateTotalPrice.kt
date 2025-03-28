package if_command

fun main() {
    println("Type the quantity of a product: ")
    val quantity = readln().toDouble()

    if (quantity < 0) {
        println("Invalid operation!")
    } else {
        if (quantity < 5) {
            println("Total price: ${quantity * 1.50}")
        } else if (quantity < 10) {
            println("Total price: ${quantity * 1.45}")
        } else if (quantity < 50) {
            println("Total price: ${quantity * 1.40}")
        } else if (quantity < 100) {
            println("Total price: ${quantity * 1.30}")
        } else {
            println("Total price: ${quantity * 1.20}")
        }
    }
}