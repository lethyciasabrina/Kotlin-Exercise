package if_command

fun main() {
    println("Enter a year: ")
    val year = readln().toIntOrNull()

    if (year == null || year < 0) {
        println("Invalid Operation!")
    } else {
        var leapYear = ""
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leapYear = "Is a Leap Year"
                }
            } else {
                leapYear = "Is a Leap Year"
            }
        } else {
            leapYear = "Is not a Leap Year"
        }
        println(leapYear)
    }
}