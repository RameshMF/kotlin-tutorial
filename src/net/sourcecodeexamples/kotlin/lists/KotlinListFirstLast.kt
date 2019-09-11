package net.sourcecodeexamples.kotlin

fun main() {

    val fruits = listOf("banana", "mango", "apple", "orange")

    val w1 = fruits.first()
    println(w1)

    val w2 = fruits.last()
    println(w2)

    val w3 = fruits.findLast { w -> w.startsWith('a') }
    println(w3)

    val w4 = fruits.first { w -> w.startsWith('o') }
    println(w4)
}