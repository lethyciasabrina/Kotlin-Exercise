package if_command

fun main() {
    println("Enter the amount of your purchase: ")
    var purchaseAmount = readln().toDouble()
    println("Enter your state: ")
    val state = readln().uppercase()
    println("Are you a premium customer? (Y or N) ")
    val isPremiumCustomer = readln()

    var freightCost: Double =
        if (state == "AC" || state == "AP" || state == "AM" || state == "PA" || state == "RO" ||
            state == "RR" || state == "TO"
        ) {
            20.0
        } else {
            if (purchaseAmount >= 150) {
                0.0
            } else {
                15.0
            }
        }
    var purchaseDiscount = 0.0
    var freightDiscount = 0.0
    if (isPremiumCustomer == "Y") {
        purchaseDiscount = purchaseAmount * 0.10
        purchaseAmount -= purchaseDiscount
        if (freightCost != 0.0) {
            freightDiscount = freightCost * 0.20
            freightCost -= freightDiscount
        }
    }
    val totalDiscount = purchaseDiscount + freightDiscount
    val finalAmount = purchaseAmount + freightCost
    println("Shipping cost: R$${"%.2f".format(freightCost)}")
    println("Total discount: R$${"%.2f".format(totalDiscount)}")
    println("Final purchase amount: R$${"%.2f".format(finalAmount)}")
}