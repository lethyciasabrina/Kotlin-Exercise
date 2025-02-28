package basic_operations

fun main() {
    println("Type the seconds: ")
    val timeInSeconds = readln().toInt()

    // Convert total seconds to hours, minutes, and remaining seconds
    val hours = timeInSeconds / 3600
    val secondsAux = timeInSeconds % 3600 // Remaining seconds after extracting hours
    val minutes = secondsAux / 60
    val seconds = secondsAux % 60 // Remaining seconds after extracting minutes

    println("Hours: ${hours}h, Minutes: ${minutes}min, Seconds: ${seconds}seg")
}

/* Conversion logic:
   - 1h = 3600s, 1min = 60s
   - Hours = totalSeconds / 3600
   - Remaining seconds = totalSeconds % 3600
   - Minutes = remaining / 60
   - Final seconds = remaining % 60
*/