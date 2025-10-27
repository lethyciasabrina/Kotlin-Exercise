package exceptions_and_files

import java.io.File
import java.io.IOException

fun main() {
    val filename = "file_reader.txt"
    val lines = readLogLines(filename)
    if (lines != null) {
        for (line in lines) {
            println(line)
        }
    }
}

fun readLogLines(filename: String): List<String>? {
    val file = File(filename)
    if (!file.exists()) {
        print("ERROR: File not found")
        return null
    }
    try {
        return file.readLines()
    } catch (e: IOException) {
        print("ERROR: I/O error reading file \n$e")
        return null
    }
}