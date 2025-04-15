package if_command

fun main() {
    println("Enter the first side of a triangle: ")
    val side1 = readln().toDoubleOrNull()
    println("Enter the second side of a triangle: ")
    val side2 = readln().toDoubleOrNull()
    println("Enter the third side of a triangle: ")
    val side3 = readln().toDoubleOrNull()

    if (side1 == null || side1 < 0 || side2 == null || side2 < 0 || side3 == null || side3 < 0) {
        println("Invalid Operation.")
    } else if (side1 != side2 && side2 != side3 && side3 != side1) {
        println("Scalene")
    } else if (side1 == side2 && side3 == side1) {
        println("Equilateral")
    } else {
        println("Isosceles")
    }
}