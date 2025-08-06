package repetition_commands

fun main() {
    var resultado = 1
    print("Set the number: ")
    val n = readln().toInt()
    for (i in n downTo 1) {
        print("$i")
        if (i != 1) {
            print(" * ")
        }
        resultado *= i
    }
    print(" = $resultado")
}