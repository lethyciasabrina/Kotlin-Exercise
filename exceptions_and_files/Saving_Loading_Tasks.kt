package exceptions_and_files

import java.io.File
import java.io.IOException

val tasksToSave = mutableListOf<String>()

fun main() {
    val filename = "tasks.txt"
    val loadedTasks = readLoadLines(filename) ?: emptyList()
    val currentTasks = loadedTasks.toMutableList()

    if (currentTasks.isEmpty()) {
        println("Your list is empty, add a new task")
    } else {
        println("Current tasks: ")
        currentTasks.forEachIndexed { index, task ->
            println("${index + 1}. $task")
        }
    }

    print("Tasks: ")
    val newTask = readln()
    tasksToSave.add(newTask)

    val saveSuccess = saveTasks(filename, tasksToSave)

    println("Successful save? $saveSuccess")
    currentTasks.forEachIndexed { index, task ->
        println("${index + 1}. $task")
    }
}

fun saveTasks(filename: String, tasks: List<String>): Boolean {
    val contentString = tasks.joinToString(separator = "\n")
    return try {
        File(filename).writeText(contentString)
        true
    } catch (e: IOException) {
        print("ERROR: $e")
        false
    }
}

fun readLoadLines(filename: String): List<String>? {
    val file = File(filename)
    if (!file.exists()) {
        return null
    }
    return try {
        file.readLines()
    } catch (e: IOException) {
        println("ERROR Reading File: $filename: ${e.message}")
        null
    }
}