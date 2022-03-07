package loops

fun main() {
    val numbers = listOf<Int>(1,2,3,5,6,8,9)
    println(reverse(numbers))
    println(reverse2(numbers))
    val weekdays = listOf<String>("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    println(reverse3(weekdays))
}

fun reverse(list: List<Int>): List<Int> {
    val result = arrayListOf<Int>()
    for (i in 0 until list.size){
//        println(i)
//        println(list.size-1-i)
        result.add(list[list.size-1-i])
    }
    return result
}

fun reverse2(list: List<Int>): List<Int> {
    val result = arrayListOf<Int>()
    for (i in list.size -1 downTo 0){
        result.add(list[i])
    }
    return result
}

fun reverse3(list: List<Any>): List<Any> {
    val result = arrayListOf<Any>()
    for (i in list.size -1 downTo 0){
        result.add(list[i])
    }
    return result
}