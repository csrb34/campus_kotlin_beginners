package oo

interface Driveable {
    fun drive()
}

interface Buildable {
    val timeRequired: Int
    fun build()
}

class Car (val color: String): Driveable, Buildable {
    override val timeRequired = 120

    override fun drive() {
        println("Driving $color car....")
    }

    override fun build() {
        println("Built a $color shiny car.")
    }
}

class MotorCycle (val color: Color): Driveable {
    override fun drive(){
        println("Driving $color motorcycle....")
    }
}

fun main() {
    val car: Driveable = Car("blue")
    car.drive()
//    car.build() // --> shows error

    val redCar: Buildable = Car("red")
    redCar.build()
    println(redCar.timeRequired)
//    println(redCar.color) // shows error

//    val yellowCar: Car = Car("yellow")
    val yellowCar = Car("yellow")
    println(yellowCar.color)
    yellowCar.drive()
    yellowCar.build()
    println(yellowCar.timeRequired)

    val moto = MotorCycle(Color.RED);
    moto.drive();
    println(moto.color);
}