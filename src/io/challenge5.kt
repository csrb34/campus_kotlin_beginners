package io

import java.io.File

fun main() {
    val ipsRecurrence = mutableMapOf<String,Int>()
    File("src/ips.txt").forEachLine { a: String ->
        var currentValue = ipsRecurrence.getOrDefault(a, 0)
        ipsRecurrence.put(a, ++currentValue)
    }
//    println(ipsRecurrence)

    var maxOccurrences: Pair<String, Int> = Pair("", 0)
    ipsRecurrence.forEach { (ip, count) ->
        if (count > maxOccurrences.second){
            maxOccurrences = Pair(ip,count)
        }
    }
    println("Most frequent IP is ${maxOccurrences.first}, which occurred ${maxOccurrences.second} times.")

    val (ip, occurrences) = ipsRecurrence.entries.maxByOrNull { it.value }!!
    println("Most frequent IP is ${ip}, which occurred $occurrences times.")
}