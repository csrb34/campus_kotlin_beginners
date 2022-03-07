fun main() {
    val books = arrayListOf("Los Caminantes", "Antologia Z", "The girl with all the gifts", "Deadpool: Merc with a mouth series")

    for (book in books) {
        if (book.contains('e')) {
            for (letter in book){
                println(letter)
            }
            println("---")
        }
    }
}