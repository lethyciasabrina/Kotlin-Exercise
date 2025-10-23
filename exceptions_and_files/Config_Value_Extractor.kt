package exceptions_and_files

fun main() {
    print("Value: ")
    val input = readln()
    println("Value Extractor: ${extractConfigValue(input)}")
}

fun extractConfigValue(input: String): String? {
    val cleanedLine = input.trim()
    if (cleanedLine.startsWith("#")) {
        return null
    }
    val pattern = Regex("^(\\w+)\\s*=\\s*(.*)$")
    val match = pattern.find(cleanedLine)
    if (match != null) {
        return match.groupValues[2].trim()
    }
    return null
}