package oo


enum class Color (val rgb:Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);

    fun containsRed(): Boolean {
        return this.rgb and 0xFF0000 != 0
    }
}

fun main() {
    // 0..9 -> 2137 (decimal) = 2*10ˆ3 + 1*10ˆ2 + 3*10ˆ1 + 7*10ˆ0
    // 0..9,A(10),B(11),C(12),D(13),E(14),F(15) -> 0x10 (hexadecimal) = 1*16ˆ1 + 0*16ˆ0  = 16 (decimal)
    println(0x10) // 16
    println(0x1F) // 31 = 1*16ˆ1 + 15*16ˆ0
    println(0xFF) // 255
    println(0xCAFEBABE) // 3405691582 = 12*16ˆ7 + 10*16ˆ6 + 15*16ˆ5 + 14*16ˆ4 + 11*16ˆ3 + 10*16ˆ2 + 11*16ˆ1 + 14*16ˆ0

    println(0xc7e)
    println(0x7e)

    // RGB common representation
    println(0x000000) // black
    println(0xFFFFFF) // white
    println(0xFF0000) // red
    println(0x0FF000) // green
    println(0x0000FF) // blue
    println(0x000088) // dark blue

    // binary numbers
    // 0,1 -> 0110 -> 0*2ˆ3 + 1*2ˆ2 + 1*2ˆ1 + 1*2ˆ0 = 6
    // 0b1010 (binary) = 10 (decimal)
    println(Integer.parseInt("0110", 2)) // 6
    println(0b1010) // 10
    println(0b00001010) // 10
    println(0b11111111 == 0xFF) // 255
    println(0b11111111_00000000_00000000 == 0xFF0000)

    // bitwise operators
    println(1 and 1 == 1)
    //     1101
    // and 1011
    // --------
    //     1001 = 9
    println(0b1101 and 0b1011)

    // 0x01CAFE and 0xFF0000 == 0x010000
    println(Color.RED.containsRed())
    println(Color.GREEN.containsRed())
    println(Color.BLUE.containsRed())
    println(Color.YELLOW.containsRed())

    //    1101
    // or 1000
    //  = 1101
    println(0b1101 or 0b1000) // 13

    //     1101
    // xor 1000
    //   = 0101
    println(0b1101 xor 0b1000) // 5

    // inverse
    // 0b10011.inv() ==  0b...01100
    // 0x0000001F == 0b00...0011111
    println(0b10011.inv() and 0x0000001F)
}