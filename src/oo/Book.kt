package oo

class BookC (val title: String, val author: String, val publicationYear: Int, var borrowed: Boolean) {
    fun borrowBook(): Boolean {
        if (borrowed) {
            println("Sorry, the book is already borrowed.")
            return false
        }
        borrowed=true
        return true
    }

    fun returnBook(): Boolean {
        if (!borrowed) {
            println("The book was not borrowed so it cannot be returned.")
            return false
        }
        borrowed=false
        return true
    }

    fun print() {
        println("Book [title: $title, author: $author, publication year: $publicationYear]")
    }
}

fun main() {
    val book = BookC("Los caminantes", "Carlos Sisi", 2013, false)

    println( book.returnBook() )
    println( book.borrowBook() )
    println( book.borrowBook() )
    println( book.returnBook() )
    book.print()
}