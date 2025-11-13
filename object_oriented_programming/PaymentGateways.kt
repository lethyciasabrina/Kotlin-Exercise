package object_oriented_programming

open class PaymentGateways(val name: String) {
    fun connect() {
        println("Connecting to payment gateway: $name")
    }

    open fun calculateFee(amount: Double): Double {
        return amount
    }
}

class CreditCardGateway(name: String) : PaymentGateways(name) {
    override fun calculateFee(amount: Double): Double {
        return amount * 0.035
    }
}

class PayPalGateway(name: String) : PaymentGateways(name) {
    override fun calculateFee(amount: Double): Double {
        return amount * 0.049
    }
}

fun main() {
    println("Which your method payment? \n1 - CreditCard \n2 - PayPal")
    val option = readln().toInt()
    val gateway: PaymentGateways = when (option) {
        1 -> {
            CreditCardGateway("Credit Card")
        }

        2 -> {
            PayPalGateway("PayPal")
        }

        else -> {
            println("Invalid option. Exiting.")
            return
        }
    }
    print("Enter the amount: R$")
    val amount = readln().toDouble()
    gateway.connect()
    val fee = gateway.calculateFee(amount)
    val totalAmount = amount + fee
    println("Transaction Amount: R$%.2f".format(amount))
    println("Fee: R$%.2f".format(fee))
    println("Total Charged: R$%.2f".format(totalAmount))
}