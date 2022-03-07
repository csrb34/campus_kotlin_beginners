package oo

abstract class Course(val topic: String, val price: Double){
    open fun learn(){
        println("Learning a $topic course.")
    }
}

interface Learnable {
    fun learn() {
        // Adding some behaviour for the example
        println("Learning....")
    }
}

open class KotlinCourse(): Course("Kotlin", 999.99), Learnable {
    final override fun learn(){ // --> adding 'final' mod makes method impossible to be over-ridden by child classes
        // super.learn() // Valid if there isn't any other parent with the same method name
        // super<Course>.learn() // Specify the parent with the '<>', this prints Course message
        super<Learnable>.learn() // Specify the parent with the '<>', this prints Learnable message
        println("I'm one of the first people to learn Kotlin!")
    }
}

class SpecialKotlinClass(): KotlinCourse(){
//    override fun learn() { // this method is not allowed because 'final' modifier in parent
//        println("Learn special Kotlin course.")
//    }
}

fun main() {
    val course = KotlinCourse()
    course.learn()
}