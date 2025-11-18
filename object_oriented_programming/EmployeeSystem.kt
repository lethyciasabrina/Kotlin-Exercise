package object_oriented_programming

abstract class Employee(val name: String, val baseSalary: Double) {
    abstract fun calculateBonus(): Double
}

interface Authenticated {
    fun authenticate(password: String): Boolean
}

class Developer(name: String, baseSalary: Double) : Employee(name, baseSalary) {
    override fun calculateBonus(): Double {
        return baseSalary * 0.1
    }
}

class Manager(name: String, baseSalary: Double) : Employee(name, baseSalary), Authenticated {
    override fun calculateBonus(): Double {
        return baseSalary * 0.15
    }

    override fun authenticate(password: String): Boolean {
        return password == "12345"
    }

}

fun main() {
    print("Name: ")
    val name = readln()
    print("Base Salary: R$")
    val salary = readln().toDoubleOrNull() ?: 0.0
    println("Choose your position: \n1 - Developer \n2 - Manager")
    val option = readln().toIntOrNull()
    val employee: Employee? = when (option) {
        1 -> {
            Developer(name, salary)
        }

        2 -> {
            Manager(name, salary)
        }

        else -> {
            print("Invalid Option.")
            null
        }
    }
    if (employee != null) {
        val bonus = employee.calculateBonus()
        println("Base Salary: R$%.2f".format(employee.baseSalary))
        println("Bonus: R$%.2f".format(bonus))
        println("Total Salary: R$%.2f".format(employee.baseSalary + bonus))
        if (employee is Authenticated) {
            print("Password: ")
            val password = readln()
            if (employee.authenticate(password)) {
                println("Success! User authenticated with access privileges.")
            } else {
                println("Authentication failed. Incorrect password.")
            }
        } else {
            println("The user does not have access privileges.")
        }
    }
}