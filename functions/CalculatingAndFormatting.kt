package functions

data class Price(var price: Double)

fun main() {
    print("Coin: ")
    val inputPrice = readln().toDouble()
    val price = Price(inputPrice).run {
        val discount = price - (price * 0.1)
        "The final price with 10% discount is: R$ ${String.format("R$%.2f", discount)}"
    }
    println(price)
}