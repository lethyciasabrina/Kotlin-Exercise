package object_oriented_programming

abstract class DataProcessor(val filename: String) {
    fun validateFile() = true
    abstract fun processData(): String
}

class JsonProcessor(filename: String) : DataProcessor(filename) {
    override fun processData(): String {
        return "Processing JSON structure from $filename"
    }
}

class XmlProcessor(filename: String) : DataProcessor(filename) {
    override fun processData(): String {
        return "Parsing XML nodes from $filename"
    }
}

fun main() {
    val jsonProcessor = JsonProcessor("data_in.json")
    val xmlProcessor = XmlProcessor("config_schema.xml")
    if (jsonProcessor.validateFile()) {
        println("Validation Status JSON: OK")
    }
    if (xmlProcessor.validateFile()) {
        println("Validation Status XML: OK")
    }
    val processors: List<DataProcessor> = listOf(jsonProcessor, xmlProcessor)
    for (processor in processors) {
        println("Processing ${processor.filename}: ${processor.processData()}")
    }
}