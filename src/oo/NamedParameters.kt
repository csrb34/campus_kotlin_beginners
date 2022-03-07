package oo

class House(val height: Double, val color: String, val price: Int = 50000) {
    fun print() {
        println("House [height=$height, color=$color, price=$price]")
    }
}

fun order(x: Int, y: Int, z: Int = 6) {
    println("x: $x, y=$y, z=$z")
}

fun main() {
    val house = House(4.5, "Blue", 150000)
    val house2 = House(height = 5.0, color="Red", price=250000)
    val house3 = House(color="Yellow", price=125000, height = 5.2)
    val house4 = House(color="Grey", height = 5.2)

    house.print()
    house2.print()
    house3.print()
    house4.print()

    order(1,2)
    order(y=5, x=2)
}