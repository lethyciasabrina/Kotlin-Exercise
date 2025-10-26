package exceptions_and_files

import java.io.File
import java.io.IOException

fun main() {
    print("Filename: ")
    val filename = readln()
    print("Content: ")
    val content = readln()
    val result = writeStatusReport(filename, content)
    print("Successful writing? $result")
}

fun writeStatusReport(filename: String, content: String): Boolean {
    try {
        val file = File(filename)
        file.writeText(content)
        print("Report saved successfully: $file")
        return true
    } catch (e: IOException) {
        print("An error occurred while saving the report: ${e.message}")
        return false
    }
}