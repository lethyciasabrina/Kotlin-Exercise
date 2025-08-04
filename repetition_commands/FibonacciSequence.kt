package repetition_commands

fun main() {
    var anterior = 0
    var meio = 1
    var proximo: Int
    print("$anterior, $meio")
    while (true) {
        proximo = meio + anterior
        if (proximo < 5000) {
            print(", $proximo")
        } else {
            break
        }
        anterior = meio
        meio = proximo
    }
}