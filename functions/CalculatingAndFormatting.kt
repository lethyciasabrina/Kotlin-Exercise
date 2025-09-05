package functions

data class Price(var price: Double)

fun main() {
    print("Price: ")
    val inputPrice = readln().toDouble()
    val priceWithDiscount = Price(inputPrice).run {
        val discount = this.price - (this.price * 0.1)
        "The final price with 10% discount is: R$ ${String.format("R$%.2f", discount)}"
    }
    println(priceWithDiscount)
}