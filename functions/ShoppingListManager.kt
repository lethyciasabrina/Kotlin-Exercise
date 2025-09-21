package functions

fun main() {
    val shoppingList = mutableListOf<String>()
    while (true) {
        println(
            "Choose an option: \n1 - Add item \n2 - Remove item \n3 - Update item " +
                    "\n4 - View List \n5 - Exit"
        )
        val option = readln().toInt()
        when (option) {
            1 -> addItem(shoppingList) // argument in the function call.
            2 -> removeItem(shoppingList)
            3 -> updatingItem(shoppingList)
            4 -> viewList(shoppingList)
            5 -> break
        }
    }
}

fun addItem(list: MutableList<String>) {
    println("Add an item: ")
    val item = readln()
    list.add(item)
    println("Item added successfully!")
}

fun removeItem(list: MutableList<String>) {
    println("Remove an item: ")
    val item = readln()
    list.remove(item)
    println("Item successfully removed!")
}

fun updatingItem(list: MutableList<String>) {
    list.forEach {
        println(it)
    }
    println("Which item do you want to update? ")
    val item = readln()
    // looking for the index of the element.
    val index = list.indexOf(item)
    if (index >= 0) {
        println("Add a new item: ")
        val newItem = readln()
        // replacing a new element based on its index.
        list[index] = newItem
        println("Item updated successfully!")
    } else {
        println("Item not found")
    }
}

fun viewList(list: MutableList<String>) {
    list.forEach {
        println(it)
    }
}