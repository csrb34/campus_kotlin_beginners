package oo

interface Lendable {
    fun borrow()
    fun returnItem()
}

abstract class InventoryItem (
    open val title: String,
    open val genre: String,
    open val publicationYear: Int,
    var available: Boolean): Lendable {

    override fun borrow() {
        return if(available) {
            available = false
        } else {
            println("Item with title '$title' is not available")
        }
    }

    override fun returnItem() {
        return if(!available) {
            available = true
        } else {
            println("Item with title '$title' can't be returned")
        }
    }
}

data class BookItem ( override val title: String,
                      val author: String,
                      override val genre: String,
                      override val publicationYear: Int)
    : InventoryItem (title, genre, publicationYear, false) {

    fun read() {
        println("Reading a book by $author...")
    }
}

data class DVDItem ( override val title: String,
                 var length: Int,
                 override val genre: String,
                 override val publicationYear: Int)
    : InventoryItem (title, genre, publicationYear, false) {

    fun watch() {
        println("Watching $title...")
    }
}


fun main() {
    val book = BookItem("Awesome book", "Carlos Moreno", "Terror", 1997)
    val dvd = DVDItem("Awesome movie", 120*60, "Drama", 2016)

    book.read()
    println(book)
    println("Available: ${book.available}")
    book.borrow()
    book.returnItem()
    println("Available: ${book.available}")
    println(book)
}

