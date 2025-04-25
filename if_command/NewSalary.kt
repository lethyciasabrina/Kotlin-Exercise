package if_command

fun main() {
    println("Enter your name: ")
    val name = readln()
    println("Enter your salary: ")
    val salary = readln().toDouble()

    val raising: Int
    if (salary <= 50000) {
        raising = 20
    } else if (salary > 50001 && salary < 100000) {
        raising = 15
    } else if (salary > 100001 && salary < 150000) {
        raising = 10
    } else {
        raising = 5
    }
    val salaryIncrease = (raising / 100.0) * salary
    val newSalary = salaryIncrease + salary
    println(
        "Hi $name your raise is ${raising}% and your new salary is ${"%.2f".format(newSalary)}"
    )
}