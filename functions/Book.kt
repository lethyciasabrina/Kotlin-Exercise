package functions

data class Book(var title: String = "", var author: String = "")

fun main() {
    print("Type the title: ")
    val newTitle = readln()
    print("Type the author: ")
    val newAuthor = readln()

    val newBook = Book().apply {
        title = newTitle
        author = newAuthor
    }
    println("Book: ${newBook.title} \nAuthor: ${newBook.author}")
}