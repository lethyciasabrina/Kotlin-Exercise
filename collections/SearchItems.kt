package collections

val stockItems = listOf(
    "Whole Milk 1L",
    "Traditional Sliced Bread",
    "Sliced Mozzarella Cheese",
    "Natural Yogurt 500g",
    "Semi-Skimmed Milk"
)

fun main() {
    print("Search an item: ")
    val query = readln()
    val result = searchItems(query, stockItems)
    println(result)
}

fun searchItems(query: String, items: List<String>): List<String> {
    return items.filter { it.contains(query, ignoreCase = true) }
}