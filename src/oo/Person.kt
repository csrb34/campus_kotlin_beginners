package oo

import java.util.Calendar
import java.math.BigInteger
import functions.getCurrentDate
import oo.CarFactory.produceCar
import oo.Color.BLUE

class Person1() {
    var name: String = "Sarah"
    var age: Int = 42

    fun speak(){
        println("Hello!")
    }

    fun greet(name: String){
        println("Hello $name!")
    }

    fun getYearOfBirth(): Int {
//        println(Calendar.getInstance().get(Calendar.YEAR))
        return Calendar.getInstance().get(Calendar.YEAR) - age
    }

    fun getYearOfBirth2() = Calendar.getInstance().get(Calendar.YEAR) - age
}

class Person2(name: String, age: Int) {

    val name: String
    var age: Int
    var birthYear = Calendar.getInstance().get(Calendar.YEAR) - age

    init {
        this.name = name
        this.age = age
//        println("Object person was created")
        val bigInt = BigInteger("3");
        val currentDate = getCurrentDate();
        produceCar();
        val blue = BLUE;

    }

    fun speak(){
        println("Hello!")
    }

    fun greet(name: String){
        println("Hello $name!")
    }

    fun getYearOfBirth() = Calendar.getInstance().get(Calendar.YEAR) - age
}

class Person3(val name: String, var age: Int) {

    var birthYear = Calendar.getInstance().get(Calendar.YEAR) - age

    init {
//        println("Object person was created")
    }

    fun speak(){
        println("Hello!")
    }

    fun greet(name: String){
        println("Hello $name!")
    }

    fun getYearOfBirth() = Calendar.getInstance().get(Calendar.YEAR) - age
}

fun main() {
    val person = Person1()
    println(person.name)
    println(person.age)
//    println(person)
    person.speak()
    person.greet("Normando")

    person.name = "Peter"
    println(person.name)

    println(person.getYearOfBirth())
    println(person.getYearOfBirth2())

//  ---------------------------------
    println("| -------- |")

    val person2 = Person2("Paula", 17)
    println(person2.name)
    println(person2.age)

    person2.speak()
    person2.greet("Normando")
    println(person2.getYearOfBirth())

//  ---------------------------------
    println("| -------- |")

    val person3 = Person3("Laura", 32)
    println(person3.name)
    println(person3.age)

    person3.speak()
    person3.greet("Normando")
    println(person3.getYearOfBirth())


}