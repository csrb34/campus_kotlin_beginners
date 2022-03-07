package oo

import java.util.*

abstract class PersonAbs (open val name: String, open var age: Int) {

//    init {
//        println("Object 'Person' is created")
//    }

    abstract fun speak() // (MUST) needs to be implemented in child classes

    open fun greet(name: String){ // (OPTIONAL) can be override in child classes
        println("Hello $name!")
    }

    fun getYearOfBirth() = Calendar.getInstance().get(Calendar.YEAR) - age
}

class Student2 (override val name: String, override var age: Int, studentID: Long): PersonAbs(name, age) {

    fun isIntelligent() = true

    override fun speak() {
        println("Hi there, I'm a student")
    }

    override fun greet(name: String){
        println("Howdy $name!")
    }

//    override fun getYearOfBirth() = 1990 // can't be override
}

class Employee2 (override val name: String, override var age: Int): PersonAbs(name, age) {

    fun receivedPayment(){
        println("Payment received.")
    }

    override fun speak() {
        println("Good morning, I'm an employee")
    }
}

fun main() {
//    val person = PersonAbs("Marta", 27) // --> shows an error

    val student = Student2("Marco", 14, studentID = 1236547892)
    student.speak()
    student.greet("Josh")
    println(student.isIntelligent())

    val employee = Employee2("Laura", 32)
    employee.speak()
    println(employee.getYearOfBirth())
    employee.receivedPayment()
}