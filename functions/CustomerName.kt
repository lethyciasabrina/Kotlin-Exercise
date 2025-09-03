package functions

fun main() {
    print("Name: ")
    val name: String? = readln()
    val userName: Customer? = searchName(name)
    val customerName = userName?.name ?: "Name not found"
    println("Customer: $customerName")
}

fun searchName(name: String?): Customer? {
    return if (name.isNullOrBlank()) {
        null
    } else {
        Customer(name)
    }
}

data class Customer(val name: String?)

