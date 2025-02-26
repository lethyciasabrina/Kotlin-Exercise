package basic_operations

fun main() {
    println("Enter 6 digits: ")
    val number = readln().toInt()

    var invertedNumber: Int
    var lastDigit = number % 10
    invertedNumber = lastDigit

    var auxNumber = number / 10
    lastDigit = auxNumber % 10
    invertedNumber = invertedNumber * 10 + lastDigit

    auxNumber /= 10
    lastDigit = auxNumber % 10
    invertedNumber = invertedNumber * 10 + lastDigit

    auxNumber /= 10
    lastDigit = auxNumber % 10
    invertedNumber = invertedNumber * 10 + lastDigit

    auxNumber /= 10
    lastDigit = auxNumber % 10
    invertedNumber = invertedNumber * 10 + lastDigit

    auxNumber /= 10
    lastDigit = auxNumber % 10
    invertedNumber = invertedNumber * 10 + lastDigit

    println("Inverted number: $invertedNumber")
}