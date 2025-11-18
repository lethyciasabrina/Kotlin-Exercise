package object_oriented_programming

abstract class BookstoreItem(val title: String, val basePrice: Double) {
    fun displaysDetails() {
        println("Details: $title \nBase Price: R$%.2f".format(basePrice))
    }

    abstract fun calculateFinalPrice(): Double
}

class Book(title: String, basePrice: Double) : BookstoreItem(title, basePrice) {
    override fun calculateFinalPrice(): Double {
        return basePrice + 5
    }
}

class Magazine(title: String, basePrice: Double) : BookstoreItem(title, basePrice) {
    override fun calculateFinalPrice(): Double {
        return basePrice - 2
    }
}

class Bookmark(title: String, basePrice: Double) : BookstoreItem(title, basePrice) {
    override fun calculateFinalPrice(): Double {
        return basePrice
    }
}

fun main() {
    val catalog = mutableListOf<BookstoreItem>()
    while (true) {
        println("What do you want to insert? \n1 - Book \n2 - Magazine \n3 - Bookmark \n0 - Exit")
        val option = readln().toIntOrNull() ?: 0
        when (option) {
            1 -> {
                print("Book title: ")
                val title = readln()
                print("Base price of the book: R$")
                val basePrice = readln().toDoubleOrNull() ?: 0.0
                catalog.add(Book(title, basePrice))
            }

            2 -> {
                print("Magazine title: ")
                val title = readln()
                print("Magazine base price: R$")
                val basePrice = readln().toDoubleOrNull() ?: 0.0
                catalog.add(Magazine(title, basePrice))
            }

            3 -> {
                print("Description of the marker: ")
                val title = readln()
                print("Base price of the marker: R$")
                val basePrice = readln().toDoubleOrNull() ?: 0.0
                catalog.add(Bookmark(title, basePrice))
            }

            0 -> {
                println("In closing...")
                break
            }

            else -> {
                print("Invalid Option.")
            }
        }
    }
    var total = 0.0
    for (item in catalog) {
        val finalPrice = item.calculateFinalPrice()
        total += finalPrice
        println(
            ("Item: ${item.title} \nType: ${item.javaClass.simpleName} " +
                    "\nFinal Price: R$%.2f").format(
                finalPrice
            )
        )
    }
    println("Total value of the catalog: R$%.2f".format(total))
}