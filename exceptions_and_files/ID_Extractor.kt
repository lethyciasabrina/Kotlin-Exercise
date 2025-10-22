package exceptions_and_files

fun main() {
    print("Enter the product code (e.g., PROD_A(42)): ")
    val input = readln()
    println("Extracted ID: ${extractID(input)}")
}

fun extractID(code: String): String? {
    val idPattern = Regex("(\\((\\d+)\\))")
    val matchResult = idPattern.find(code)
    if (matchResult != null) {
        return matchResult.groupValues[2]
    }
    return null
}