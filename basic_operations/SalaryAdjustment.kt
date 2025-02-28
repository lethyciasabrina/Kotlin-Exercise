package basic_operations

fun main() {
    println("Type your name: ")
    val name = readln()
    println("Type your salary: ")
    val salary = readln().toDouble()
    println("Type your years of experience: ")
    val yearsOfExperience = readln().toInt()
    println("Type how many children you have: ")
    val kids = readln().toInt()

    val percentageExperience = yearsOfExperience * 0.5
    val percentageKids = kids * 2
    val salaryIncreasePercentage = percentageExperience + percentageKids
    val salaryIncrease = salary * (salaryIncreasePercentage / 100)
    val newSalary = salary + salaryIncrease

    println("Name: $name, New salary: $newSalary, " +
            "Salary Increase Percentage: $salaryIncreasePercentage, " +
            "Salary Increase: $salaryIncrease"
    )
}