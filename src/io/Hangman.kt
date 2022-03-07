package io

import java.util.*

fun main()  {
    print("Enter the word to guess: ")
    val word = readLine()
    if (word == null) {
        println("No word given, game ended.")
        return
    }

    // Add blank lines to hide the word for the other user
    for (i in 1..100){
        println()
    }

    val letters = word.lowercase().toCharArray().toHashSet()
    val correctGuesses = mutableSetOf<Char>()
    var fails = 0
    var maxFails = 10

    while ((letters != correctGuesses) && (fails < maxFails)) {
        println(letters)
        println(correctGuesses)
        println(letters == correctGuesses)

        print("Letter: ")
        val input = readLine()

        if (input == null || input.length != 1){
            println("Incorrect input value: $input")
            continue
        }

        val letter = input.lowercase()[0]

        if (letters.contains(letter)){
            correctGuesses.add(letter)
        } else {
            fails++
            println("Number of tries left: ${maxFails-fails}")
        }

        printExploredWord(word, correctGuesses)
    }

    if (fails == maxFails){
        println("Maximum number of tries reached: $maxFails")
        println("Better luck next time!")
    } else {
        println("#Wrong guesses: $fails\n\n")
        println("Well done!")
    }
}

fun printExploredWord(word: String, correctGuesses: Set<Char>){
    for (letter in word.lowercase()){
        if (letter in correctGuesses){
            print("$letter ")
        } else {
            print("_ ")
        }
    }
    println("\n\n------------------\n")
}