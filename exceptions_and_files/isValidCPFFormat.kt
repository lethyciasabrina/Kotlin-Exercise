package exceptions_and_files

fun main() {
    print("CPF: ")
    val cpf = readln()
    println("Is this a valid CPF (Brazilian tax identification number)? ${isValidCPFFormat(cpf)}")
}

fun isValidCPFFormat(cpf: String): Boolean {
    val cleanedCPF = cpf.trim()
    val pattern = Regex("""^\d{3}.\d{3}.\d{3}-\d{2}$""")
    return pattern.matches(cleanedCPF)
}