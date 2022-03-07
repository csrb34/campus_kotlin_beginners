package io

import kotlin.random.Random

fun main() {
    val number = Random.nextInt(100) + 1
    var input: String?
    var guess = -1
    println("### Number: $number")

   while(guess != number){
       print("Guess a number between 1 and 100: ")
       input = readLine()

       if (input != null){
           // can throw NumberFormatException
           guess = input.toInt()
       }
       println("### Guess: $guess")

       if (guess < number){
           println("Too low")
       } else if (guess > number){
           println("Too large")
       } else {
           println("You won!")
       }
   }
}