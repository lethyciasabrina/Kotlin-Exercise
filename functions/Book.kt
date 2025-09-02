package functions

data class Book(var title: String = "", var author: String = "")

fun main() {
    val classic = Book().apply {
        title = "Friends, lovers and that terrible thing"
        author = "Matthew Perry"
    }
    println("Book Title: ${classic.title} \nBook Author: ${classic.author}")
}