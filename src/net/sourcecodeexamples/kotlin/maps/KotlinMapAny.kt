package net.sourcecodeexamples.kotlin

fun main() {

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)

    val value = 3

    val hasValue = numbersMap.any { it.value == value }

    if (hasValue) {
        println("The map has value $value")
    } else {
        println("The map does not have value $value")
    }

    val isEven: (Int) -> Boolean = { it % 2 == 0 }

    val hasEvenValue = numbersMap.any { isEven(it.value) }

    if (hasEvenValue) {
        println("The map has even value(s)")
    } else {
        println("The map does not have even value(s)")
    }
}