package collections

import kotlin.random.Random

fun main() {
    // Arrays

    val array = arrayOf("Monday", "Tuesday", "Wednesday", "Tuesday", "Friday")
    // list.add() -> doesn't exist, fixed length

    val mixed = arrayOf("Kotlin", 17, 3.0, false)
    println(mixed[0])
    mixed[2] = 3.1415 // internally uses mixed.get and mixed.set methods
    println(mixed[2])

    val str = "Udemy"
    println(str[0])

    val weekend = arrayOf("Saturday", "Sunday")
    val weekDays = array + weekend
    // println(weekend.contentToString())
    println(weekDays.contentToString())
    println(weekDays.size)

    if (weekend.contains("Tuesday")) {
        println("Tuesday is part of the weekend")
    } else {
        println("Tuesday is NOT part of the weekend")
    }

    val numbers = intArrayOf(1,2,3,4,5)
    // numbers[1] = "A" returns error

    val empty: Boolean = numbers.isEmpty()
    println(empty)

    val a = Random.nextInt(1, 20)
    val isInRange = if (a in 1..10) "$a is in 1 to 10 range" else "$a is NOT in 1 to 10 range"
    println(isInRange)

    // ---------------------------------------------------
    println("---------")

    // Lists
    val arrayList = arrayListOf("One", "Two", "Three")
    arrayList.add("Four")

    // Actually NOT mutable
    val list = listOf("Orange", "Apple", "Bananas")
    // list.add() -> doesn't exist

    val fruits = arrayListOf("Orange", "Apple", "Bananas")
    val fruit = arrayListOf("Tomato")
    println(fruits[0])
    println(fruits + fruit)
    println(fruits.size)
    println(fruits.isEmpty())
    println(fruits.contains("Apple"))

    val changed = fruits.add("Pineapple")
    val changed2 = fruits.add(1, "Peach")
    println(fruits)
    println(changed)
    println(changed2)

    val removed = fruits.remove("Tomato")
    val removed2 = fruits.remove("Pineapple")
    println(fruits)
    println(removed)
    println(removed2)

    var subList = fruits.subList(1, 2)
    println(subList)
    var subList2 = fruits.subList(1, 4)
    println(subList2)

}