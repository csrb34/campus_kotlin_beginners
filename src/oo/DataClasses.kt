package oo

import java.math.RoundingMode
import java.text.DecimalFormat
import java.util.*

class Book (val title: String, val author: String, val publicationYear: Int, var price: Double) {
    override fun toString(): String { // If not over-ridden, this prints package.className@memoryAddress
        return "Book[tittle=$title, author=$author, publicationYear=$publicationYear, price=$price]"
    }
}

data class DataBook (val title: String, val author: String, val publicationYear: Int, var price: Double) {
    fun addDiscount (discount: Int): Double {
        val truncate = "%.2f".format(Locale.ROOT, price-(price*(discount.toDouble()/100)))
        return truncate.toDouble()
    }
}

fun main() {
    val book = Book("Super book", "John Doe", 2017, 99.99)
    val book2 = Book("Super book", "John Doe", 2017, 99.99)
    val dataBook = DataBook("Super book", "John Doe", 2017, 99.99)
    val dataBook2 = DataBook("Super book", "John Doe", 2017, 99.99)
    val dataBook3 = dataBook.copy(price=89.99) // with empty parenthesis makes an exact copy

    println(book) // prints package.className@memoryAddress
    println(dataBook)
    println(dataBook3)

    println(book.equals(book2))
    println(dataBook.equals(dataBook2))

    // Decomposition
    val (title, author, year, price) = dataBook
    println(title)
    println(year)

    // Hash sets
    val set = hashSetOf(dataBook, dataBook2, dataBook3)
    println(set) // Show only two elements, avoid duplicates
    val set2 = hashSetOf(book, book2)
    println(set2) // Show both even though they are identical

    println(dataBook.addDiscount(10))
}