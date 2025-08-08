package repetition_commands

import kotlin.random.Random

fun main() {
    var tentativas = 0
    var menor = 1
    var maior = 100
    val randomNumber = Random.nextInt(menor, maior + 1)
    while (true) {
        print("Chute: ")
        val chute = readln().toInt()
        if (chute < randomNumber) {
            menor = chute + 1
            tentativas++
        } else if (chute > randomNumber) {
            maior = chute - 1
            tentativas++
        } else {
            tentativas++
            println("Você acertou. Tentativas: $tentativas")
            break
        }
        if (menor == maior) {
            println("Sinto muito, sobrou um número possível ($menor) e ele não foi o chute correto. Tentativas: $tentativas")
            break
        }
        println("Tente adivinhar um número entre $menor e $maior")
    }
}