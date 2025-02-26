package basic_operations

fun main() {
    println("Type the seconds: ")
    val timeInSeconds = readln().toInt()

    val hours = timeInSeconds / 3600
    val secondsAux = timeInSeconds % 3600
    val minutes = secondsAux / 60
    val seconds = secondsAux % 60

    println("Hours: ${hours}h, Minutes: ${minutes}min, Seconds: ${seconds}seg")
}

/* hours -> 1h - 3600seg
   minutes -> 1min - 60seg
   timeInSeconds -> 7265
    1. How many whole hours fit into the value in seconds divided by 3600.
        val hours = timeInSeconds / 3600 = 2h
    2. Then, look at the remainder (what's left of the seconds after calculating the hours).
        val secondsAux = timeInSeconds % 3600 = 65
    3. Finally, what's left will be the final seconds.
        val minutes = secondsAux / 60 = 1min
        val seconds = secondsAux % 60 = 5seg
*/