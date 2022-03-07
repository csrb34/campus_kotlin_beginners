package oo

// DRY = don't repeat yourself

class Stack<E>(vararg val items: E) {

    val elements = items.toMutableList()

    fun push(element: E) {
        elements.add(element)
    }

    fun pop(): E? {
        if (!isEmpty()) {
            return elements.removeAt(elements.size - 1)
        }
        return null
    }

    fun isEmpty(): Boolean {
        return elements.isEmpty()
    }
}

fun <T> stackOf(vararg elements: T): Stack<T>{
    return Stack(*elements)
}

fun main() {
    val stack = Stack(3,5,7,8)
    stack.push(11)
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())

    val stack2 = stackOf("Hi", "Hey", "Hello")
    for (i in 1..3){
        println(stack2.pop())
    }
}
