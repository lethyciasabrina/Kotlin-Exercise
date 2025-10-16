package collections

val tasks = mutableListOf<String>()

fun main() {
    while (true) {
        println(
            "What do you want to do? \n1 - Add Task \n2 - List Tasks " +
                    "\n3 - Edit Task \n4 - Remove Task \n0 - Exit"
        )
        val choose = readln().toIntOrNull()

        if (choose != null) {
            when (choose) {
                1 -> addTask(tasks)
                2 -> listTask(tasks)
                3 -> editTask(tasks)
                4 -> removeTask(tasks)
                0 -> {
                    println("Bye!")
                    return
                }

                else -> println("Invalid option, please choose again.")
            }
        } else {
            println("Invalid input. Please enter a number.")
        }
    }
}

fun addTask(taskList: MutableList<String>) {
    print("Task: ")
    val task = readln()
    if (task.isEmpty()) {
        println("Please, enter a task")
    } else {
        taskList.add(task)
    }
}

fun listTask(taskList: MutableList<String>) {
    if (taskList.isEmpty()) {
        println("You don't have any tasks yet.")
    } else {
        taskList.forEachIndexed { index, task ->
            println("${index + 1}. $task")
        }
    }
}

fun editTask(taskList: MutableList<String>) {
    println("Choose a number to edit: ")
    listTask(taskList)
    val edit = readln().toInt()
    val indexToEdit = edit - 1
//  converting to the real index from the list
    if (indexToEdit >= 0 && indexToEdit < taskList.size) {
        println("Enter the new task: ")
        val newTask = readln()
        taskList[indexToEdit] = newTask
        println("Task edited successfully!")
    } else {
        print("Error: Please enter a valid number")
    }
}

fun removeTask(taskList: MutableList<String>) {
    println("Choose a number to remove: ")
    listTask(taskList)
    val remove = readln().toInt()
    val indexToRemove = remove - 1
    if (indexToRemove >= 0 && indexToRemove < taskList.size) {
        taskList.removeAt(indexToRemove)
        println("Task removed successfully!")
    } else {
        print("Error: Please enter a valid number")
    }
}
