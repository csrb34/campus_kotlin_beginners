package io

import java.io.File

class ReadingFiles {
}

fun main() {

    var lineNumber = 0
    File("src/inputfile.txt").forEachLine {
        ++lineNumber
        println("#$lineNumber: $it")
    }
}