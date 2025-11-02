package exceptions_and_files

data class LogEntry(
    val dateTime: String,
    val type: String,
    val message: String
)

fun main() {
    val logFileName = "application_log.txt"
    val errors = analyzeLogFile(logFileName)
    val warnings = analyzeLogFile(logFileName, "WARNING")
    val successes = analyzeLogFile(logFileName, "SUCCESS")

    if (errors.isNotEmpty() || warnings.isNotEmpty() || successes.isNotEmpty()) {
        println("Errors found: ${errors.size}")
        errors.forEach {
            println(" > $it")
        }
    } else {
        println("No errors found in the log.")
    }
}

fun analyzeLogFile(filename: String, logType: String = "ERROR"): List<LogEntry> {
    val logPattern = Regex("""^\[(.*?)]\s+(\w+):\s+(.*)$""")
    val allLines: List<String> = readLogLines(filename) ?: emptyList()
    if (allLines.isEmpty()) {
        print("Warning: No log loaded or empty file.")
        return emptyList()
    }
    val analyzedEntries = allLines.filter { line ->
        line.contains(logType, ignoreCase = true)
    }.mapNotNull { line ->
        val matchResult = logPattern.find(line)
        return@mapNotNull if (matchResult != null && matchResult.groupValues.size >= 4) {
            val dateTime = matchResult.groupValues[1]
            val type = matchResult.groupValues[2]
            val message = matchResult.groupValues[3].trim()
            LogEntry(dateTime, type, message)
        } else {
            null
        }
    }
    return analyzedEntries
}