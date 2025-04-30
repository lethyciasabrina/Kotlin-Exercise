package if_command

fun main() {
    println("Enter your name: ")
    val name = readln()
    println("Enter your salary: ")
    val salary = readln().toDouble()

    val raising = if (name.isBlank() || !name.all { it.isLetter() } || salary < 0) {
        println("Invalid Operation")
        return
    } else if (salary in 0.0..50000.0) {
        20
    } else if (salary in 50001.0..100000.0) {
        15
    } else if (salary in 100001.0..150000.0) {
        10
    } else {
        5
    }
    val newSalary = salary + salary * (raising / 100.0)
    println(
        "Hi $name your raise is ${raising}% and your new salary is ${"%.2f".format(newSalary)}"
    )
}