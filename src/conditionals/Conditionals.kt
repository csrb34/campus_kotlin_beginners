package conditionals

import kotlin.random.Random

fun main () {
    // val age: Int = 21
    val age: Int = Random.nextInt(15, 30)
    println("age: $age")

    if (age < 18) {
        println("You cannot register.")
    } else if (age < 21) {
        println("Well, maybe you can register.")
    } else if (age < 27) {
        println("You should be able to register.")
    } else {
        println("Your are good to go!")
    }

    // -------------------------------
    // val mode: Int = 2
    val mode: Int = Random.nextInt(1, 5)
    println("mode: $mode")

    when (mode) {
        1 -> println("The mode is lazy.")
        2 -> {
            println("The mode is 2")
            println("So the mode is busy.")
        }
        3 -> println("The mode is super-productive.")
        else -> println("I don't know that mode.")
    }

    // -------------------------------
    val result = when (mode) {
        1 -> "The mode is lazy."
        2 -> {
            println("The mode is 2")
            3 + 1
            2 + 1 // returns the last one
        }
        3 -> 3 + 4
        else -> "I don't know that mode."
    }

    println("Result: $result")

    val x = if (mode < 2 ){
        println("Mode is less than 2")
        17
    } else {
        42
    }
    println("x: $x")

    // -------------------------------
    val list = listOf(5, 3*12, "Hey there") + listOf(1..30).flatten()
    // println("list: $list")

    val x2 = list.random()
    println("x2: $x2")

    when (x2) {
        5 -> println("x is 5")
        3*12 -> println("x is 3*12")
        "Hey there".length -> println("x is the length of the string 'Hey there'")
        in 1..10 -> println("x is between 1 and 10")
        in 11..20 -> println("x is between 11 and 20")
        in 21..30 -> println("x is between 21 and 30")
        !in 1..9 -> println("x is NOT between 1 and 9")
    }

    println("The end.")
}