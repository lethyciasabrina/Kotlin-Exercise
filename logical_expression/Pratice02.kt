package logical_expression

import kotlin.math.*

fun main() {
    val absoluteValue = abs(-8)
    val number1 = 20
    val number2 = 100
    val number3 = 5
    val number4 = 20.0
    val number5 = 5.0
    val number6 = 100.0
    val number7 = 2.0
    val number8 = 25.0
    val number9 = 3.47
    val number10 = 3.60

    println("The absolute value is: $absoluteValue")
    println("The max value is: ${max(number1, number3)}")
    println("The min value is: ${min(number2, number3)}")
    println("The pow is: ${2.0.pow(4.0)}")
    println("The pow is: ${number5.pow(number7)}")
    println("Square Root of 100 is: ${sqrt(number6)}")
    println("Square Root of 20 is: ${sqrt(number8)}")
    println("Ceiling: ${ceil(number9)}")
    println("Floor: ${floor(number9)}")
    println("Round: ${round(number10)}")
    println("Truncate: ${truncate(number9)}")
}