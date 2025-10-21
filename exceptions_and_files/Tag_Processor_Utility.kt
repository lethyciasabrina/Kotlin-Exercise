package exceptions_and_files

fun main() {
    print("Tags: ")
    val inputTags = readln()
    println("Clean Tags: ${processTags(inputTags)}")
}

fun processTags(inputTags: String): List<String> {
    val outputTags = inputTags
        .split(",")
        .map { it.trim() }
    return outputTags
}