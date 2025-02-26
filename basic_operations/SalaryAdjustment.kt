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

/* Name = ?
   Salary = ?
   Years of experience = ?
   Number of kids = ?
   % per year of experience = 0.5
   % per kid = 2
   New salary = ?
   ----------------------
   Years of experience * (0.5 / 100)
   2 years = 0.5% * 2 = 0.01
   ----------------------
   Number of kids * (2 / 100)
   3 kids = 2% * 3 = 0.06
   ----------------------
   new salary = years + kids * salary
   new salary = 0.01 + 0.06 * 1500
   new salary = 90.01
   new salary = salary + new salary
   new salary = 1590.01
*/