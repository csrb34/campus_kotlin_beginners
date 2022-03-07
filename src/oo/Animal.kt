package oo

open class Animal {
    var age: Int = 0
    // get() = field
    set(value) {
        if(value >=0){
            field = value
        }
    }

    private var numberOfLimbs: Int = 4
    protected var name = "Sam"
    internal val isDangerous = true

    public fun isOld(): Boolean {
        return age > 12
    }


    fun hasFourLimbs(): Boolean {
        return numberOfLimbs == 4
    }
}

class Vertebrate: Animal() {
    fun introduceYourself() {
        println(this.name)
    }
}

fun main() {
    val animal = Animal()
    animal.age = 8
    animal.age = -2
    println(animal.age)

    println(animal.hasFourLimbs())
    println(animal.isOld())


}