package conditionals

import kotlin.random.Random

fun main () {

    when (val random = Random.nextInt(50) + 1) {
        in 1..10 -> println("Random value '$random' is between 1 and 10")
        in 11..20 -> println("Random value '$random' is between 11 and 20")
        in 21..30 -> println("Random value '$random' is between 21 and 30")
        in 31..40 -> println("Random value '$random' is between 31 and 40")
        else -> println("Over 40: $random")
    }
}