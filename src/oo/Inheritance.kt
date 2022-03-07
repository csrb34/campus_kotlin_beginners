package oo

import java.util.*

open class Person (open val name: String, open var age: Int) {

    init {
        println("Object 'Person' is created")
    }

    fun speak(){
        println("Hello!")
    }

    fun greet(name: String){
        println("Hello $name!")
    }

    fun getYearOfBirth() = Calendar.getInstance().get(Calendar.YEAR) - age
}

class Student (override val name: String, override var age: Int, studentID: Long): Person(name, age) {
    fun isIntelligent() = true
}

class Employee (override val name: String, override var age: Int): Person(name, age) {
    fun receivedPayment(){
        println("Payment received.")
    }
}

fun main() {
    val person = Person("Marta", 27)
    person.speak()

    val student = Student("Marco", 14, studentID = 1236547892)
    student.speak()
    println(student.isIntelligent())

    val employee = Employee("Laura", 32)
    println(employee.getYearOfBirth())
    employee.receivedPayment()
}

class Normal
//class Subclass: Normal() // --> shows an error