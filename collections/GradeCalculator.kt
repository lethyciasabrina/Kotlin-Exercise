package collections

import kotlin.collections.maxOrNull

val listOfGrades = mutableListOf<Double>()

fun main() {
    while (true) {
        println(
            "What do you want to do? \n1. Add notes \n2. Calculate Average \n3. Find higher grade " +
                    "\n4. Find the lower grade \n5. Exit"
        )
        val choice = readln().toInt()
        when (choice) {
            1 -> addNotes()
            2 -> averageScore(listOfGrades)
            3 -> highestScore(listOfGrades)
            4 -> lowestScore(listOfGrades)
            5 -> break
            else -> println("Invalid")
        }
    }
}

fun addNotes() {
    print("Enter the grade: ")
    val grade = readln().toDouble()
    listOfGrades.add(grade)
}

fun averageScore(listOfGrades: MutableList<Double>) {
    if (listOfGrades.isEmpty()) {
        println("Cannot calculate average: The list of grades is empty.")
    } else {
        val sum = listOfGrades.sum()
        val size = listOfGrades.size
        val average = sum / size
        println("The average score is: $average")
    }
}

fun highestScore(listOfGrades: MutableList<Double>) {
    val highest = listOfGrades.maxOrNull()
    if (highest != null) {
        println("The highest grade is: $highest")
    } else {
        println("Cannot find highest grade: The list is empty.")
    }
}

fun lowestScore(listOfGrades: MutableList<Double>) {
    val lowest = listOfGrades.minOrNull()
    if (lowest != null) {
        println("The lowest grade is: $lowest")
    } else {
        println("Cannot find lowest grade: The list is empty.")
    }
}