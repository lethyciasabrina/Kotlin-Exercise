package basic_operations

fun main() {
    println("Type your name: ")
    val name = readln()
    println("Type your salary: ")
    val salary = readln().toDouble()
    println("Type the salary increase percentage: ")
    val salaryIncreasePercentage = readln().toDouble()

    val salaryIncrease = (salaryIncreasePercentage / 100) * salary
    val newSalary = salary + salaryIncrease

    println("Name: $name, New Salary: $newSalary, Salary Increase: $salaryIncrease")
}