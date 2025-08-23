package functions

fun main() {
    print("Coin: ")
    val coin = readln().toDouble()
    println(coin.coin())
}

fun Double.coin(): String {
    return String.format("R$%.2f", this)
}