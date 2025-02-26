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

/* Name: Lethycia
   Salary: 2800
   Salary increase percentage: 6%
   New salary: 2.968
   ---------------------
   Salary = 2800
   Salary increase percentage = 6% -> 0.06
   Increase percentage = 168
   New salary = Salary + Increase percentage
   New salary = 2.968
   ---------------------
   ---------------------
   Salary = 3000,00
   Salary increase percentage = 6%
   ---------------------
   Increase percentage = 6 / 100 * 3.000,00
   Increase percentage = 0.06 * 3000,00
   Increase percentage = 180
   ----------------------
   New salary = salary + increase percentage
   New salary = 3000,00 + 180
   New salary = 3180,00
*/