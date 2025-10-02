package functions

fun main() {
    val studentsGrade = mutableMapOf<String, Int>()
    for (i in 1..3) {
        print("Enter your name: ")
        val name = readln()
        print("Enter your grade: ")
        val grade = readln().toInt()
        studentsGrade[name] = grade
    }
    print("Which student do you want to know the grade? ")
    val choice = readln()
    val output = studentsGrade[choice] ?: "not found"
    println("$choice's grade is: $output")
}