package functions

fun main() {
    print("Name: ")
    val name: String? = readln()
    name?.let {
        val customer = Customer(name = it)
        println("Customer: ${customer.name}")
    }
}

data class Customer(val name: String = "")