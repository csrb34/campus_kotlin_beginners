package loops

fun main() {
    var sum = 0L
    for (i in 100..100000L) {
        sum += i
    }
    println("sum: $sum")
}