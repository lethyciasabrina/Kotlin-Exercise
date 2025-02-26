package logical_expression

/*  Examples using: Married, Salary, Has a job, is a manager
    - Is married
    - Is married and is a manager
    - Married and has a job
    - Salary greater than 150.000 and is a manager
    - Is married, salary greater than 150.000 and is manager
    - Not married and Salary greater than or equal to 150.000 or is not a manager
*/

fun main() {
    val isMarried = true
    val salary = 120000
    val job = true
    val isManager = false

    println("Is married? = $isMarried")
    println("Married and Manager = ${isMarried && isManager}")
    println("Married and has a job = ${isMarried && job}")
    println("Salary greater than 150.000 and is a manager = ${salary > 150000 && isManager}")
    println(
        "Is married, salary greater than 150.000 and is manager? " +
                "${isMarried && salary > 150000 && isManager}"
    )
    println(
        "Not married and Salary greater than or equal to 150.000 or is not a manager? " +
                "${((!isMarried) && salary >= 150000) || (!isManager)}"
    )
}