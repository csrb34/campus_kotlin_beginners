package functions

import java.util.Date

fun helloWorld() {
    println("Hello World!")
}

fun printWitSpaces(text: String) {
    for (letter in text){
        print("$letter ")
    }
    println()
}

fun getCurrentDate():  Date {
    return Date()
}

fun max(a: Int, b: Int): Int {
   return if (a >= b) a else b
}

fun main() {
    helloWorld()
    printWitSpaces("Kotlin is awesome!")
    println(getCurrentDate())
    println(max(3,2))
    println(max(1,5))
}