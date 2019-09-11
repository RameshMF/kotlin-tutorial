package net.sourcecodeexamples.kotlin

fun main() {

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)

    println(numbersMap["key1"])

    println(numbersMap.getValue("key2"))

    println(numbersMap.getOrDefault("key2", 0))
    println(numbersMap.getOrDefault("key5", 0))

    val num = numbersMap.getOrElse("key4", {
        0
    })

    println(num)
}