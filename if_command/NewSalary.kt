package if_command

fun main() {
    println("Enter your name: ")
    val name = readln()
    println("Enter your salary: ")
    val salary = readln().toDouble()

    val raising: Int
    if (salary in 0.0..50000.0) {
        raising = 20
    } else if (salary in 50001.0..100000.0) {
        raising = 15
    } else if (salary in 100001.0..150000.0) {
        raising = 10
    } else {
        raising = 5
    }
    val newSalary = salary + salary * (raising / 100.0)
    println(
        "Hi $name your raise is ${raising}% and your new salary is ${"%.2f".format(newSalary)}"
    )
}