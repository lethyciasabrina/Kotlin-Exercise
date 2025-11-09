package object_oriented_programming

class BankAccount(val holder: String, val numberAccount: String) {
    private var balance: Double = 0.0

    fun getBalance(): Double {
        return balance
    }

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposit of R$$amount completed")
        } else {
            println("The deposit amount must be positive.")
        }
    }

    fun withdraw(amount: Double): Boolean {
        if (amount > 0 && balance >= amount) {
            balance -= amount
            println("Withdrawal of R$$amount completed.")
            return true
        } else {
            println("Error: Withdrawal of R$$amount not allowed. Insufficient funds or invalid amount.")
            return false
        }
    }
}

fun main() {
    print("Holder: ")
    val holderAccount = readln()
    print("Number account: ")
    val numberAccount = readln()
    val account = BankAccount(holderAccount, numberAccount)
    println("Account $holderAccount ($numberAccount) successfully created!")
    while (true) {
        println("Choose an option: \n1 - View Balance \n2 - Deposit \n3 - Withdraw \n0 - Exit")
        val option = readln().toIntOrNull()
        when (option) {
            1 -> {
                println(account.getBalance())
            }

            2 -> {
                println("How much do you want to deposit?")
                val amount = readln().toDoubleOrNull() ?: 0.0
                account.deposit(amount)
            }

            3 -> {
                println("How much do you want to withdraw?")
                val amount = readln().toDoubleOrNull() ?: 0.0
                account.withdraw(amount)
            }

            0 -> {
                println("In closing...")
                break
            }

            else -> {
                println("Invalid option. Please try again.")
            }
        }
    }
}