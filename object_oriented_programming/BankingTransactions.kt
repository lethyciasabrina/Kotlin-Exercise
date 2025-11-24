package object_oriented_programming

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class Transaction(
    val value: Double,
    val type: String
)

interface Loggable {
    fun logRegister(): String
}

class HighValueWithdraw(val value: Double) : Loggable {
    override fun logRegister(): String {
        val timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"))
        return "HIGH VALUE LOG [$timestamp]: Withdraw of R$%.2f".format(value)
    }
}

class Account(val holder: String, initialBalance: Double) {
    var balance: Double = initialBalance
        private set

    private val history: MutableList<Transaction> = mutableListOf()

    fun getHistory(): List<Transaction> {
        return history
    }

    fun getBalance(): Double {
        return balance
    }

    fun deposit(value: Double) {
        balance += value
        val depositTransaction = Transaction(
            value = value,
            type = "Deposit"
        )
        history.add(depositTransaction)
        println("Deposit of R$%.2f successfully completed.".format(value))
    }

    fun withdraw(value: Double) {
        if (balance >= value) {
            balance -= value
            if (value >= 1000.0) {
                val logObject = HighValueWithdraw(value)
                println(logObject.logRegister())
            }
            val withdrawTransaction = Transaction(
                value = value,
                type = "Withdraw"
            )
            history.add(withdrawTransaction)
            println("Withdraw of R$%.2f successfully completed.".format(value))
        } else {
            println("Transaction failed, your balance is insufficient (R$%.2f)".format(balance))
        }
    }
}

fun main() {
    print("Enter the account holder: ")
    val holder = readln()
    print("Deposit an initial balance: ")
    val balance = readln().toDoubleOrNull() ?: 0.0
    val myAccount = Account(holder, balance)
    println("Congrats! Your account has been created.")
    while (true) {
        println(
            "Choose an option: \n1 - Deposit \n2 - Withdraw \n3 - Transaction History " +
                    "\n4 - View Balance \n0 - Exit"
        )
        val option = readln().toIntOrNull() ?: 0
        when (option) {
            1 -> {
                print("How much do you want to deposit: R$")
                val value = readln().toDoubleOrNull() ?: 0.0
                myAccount.deposit(value)
            }

            2 -> {
                print("How much do you want to withdraw: R$")
                val value = readln().toDoubleOrNull() ?: 0.0
                myAccount.withdraw(value)
            }

            3 -> {
                for (transactions in myAccount.getHistory()) {
                    println("Value: ${transactions.value} \nType: ${transactions.type}")
                }
            }

            4 -> {
                println("Current balance: %.2f".format(myAccount.getBalance()))
            }

            0 -> {
                println("In closing...")
                break
            }

            else -> {
                println("Invalid Option.")
            }
        }
    }
}