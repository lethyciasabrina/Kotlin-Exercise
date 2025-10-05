package functions

fun main() {
    val task = mutableListOf<String>()
    var inputTask: String
    while (true) {
        print("Enter a task (type 'exit' to finish): ")
        inputTask = readln()
        if (inputTask.equals("exit", ignoreCase = true)) {
            break
        } else {
            task.add(inputTask)
        }
    }
    task.forEach {
        println("Task: $it")
    }
}