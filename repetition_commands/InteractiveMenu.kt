package repetition_commands

fun main() {
    var pedido = -1
    var total = 0.0
    while (true) {
        println(
            "Escolha uma opção:\n" +
                    "1 - Pizza (R$25.00)\n" +
                    "2 - Hambúrguer (R$18.00)\n" +
                    "3 - Refrigerante (R$5.00)\n" +
                    "4 - Suco (R$7.00)\n" +
                    "0 - Sair"
        )
        pedido = readln().toInt()
        when (pedido) {
            1 -> total += 25.0
            2 -> total += 18.0
            3 -> total += 5.0
            4 -> total += 7.0
            0 -> {
                println("Total final: R$$total")
                println("Volte sempre! :) ")
                break
            }

            else -> println("Opção inválida")
        }
        println("Total Parcial: R$$total")
        println("Deseja continuar? (s/n)")
        if (readln().lowercase() == "n") {
            println("Total final: R$$total")
            println("Volte sempre! :)")
            break
        }
    }
}