package if_command

fun main() {
    println("Type a number: ")
    val n1 = readln().toInt()
    println("Type a number: ")
    val n2 = readln().toInt()
    println("Type a number: ")
    val n3 = readln().toInt()

    if (n1 < n2 && n2 < n3) {
        println("$n1, $n2, $n3")
    } else if (n1 < n3 && n3 < n2) {
        println("$n1, $n3, $n2")
    } else if (n2 < n1 && n1 < n3) {
        println("$n2, $n1, $n3")
    } else if (n2 < n3 && n3 < n1) {
        println("$n2, $n3, $n1")
    } else if (n3 < n1 && n1 < n2) {
        println("$n3, $n1, $n2")
    } else {
        println("$n3, $n2, $n1")
    }
}

