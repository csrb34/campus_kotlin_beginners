package loops

fun main() {

    // For

    var sum = 0
    for (i in 1..100) {
        // sum = sum + i
        sum += i
        // println("i: $i, sum: $sum")
    }
    println("sum: $sum")

    val list = listOf<String>("Java", "Kotlin", "Python")
    for (element in list) {
        println(element)
    }

    for ((index, value) in list.withIndex()) {
         println("Element at $index is $value")
    }

    // ---------------------------------------------------
    println("---------")

    // While
    var x = 5
    while (x >= 0) {
        println(x)
        x--
    }

    // ---------------------------------------------------
    println("---------")

    // Break, continue
    for (c in "Python") {
        if (c == 'o') {
            break
        }
        print(c)
    }
    println()

    val list2 = listOf("Book", "Table", "Laptop")
    for ( str in list2) {
        if (!str.contains('o')) {
            continue
        }
        println(str)
    }

    outer@ for (i in 1..10) {
        for (j in 1..10) {
            if (i - j == 5) {
                //  break  // -> breaks 'j' loop only
                break@outer // -> breaks 'i' loop also
            }
            println("$i - $j")
        }
    }

}