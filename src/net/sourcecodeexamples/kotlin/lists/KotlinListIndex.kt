package net.sourcecodeexamples.kotlin

fun main() {

    val fruits = listOf("banana", "mango", "apple", "orange", "banana")

    val w1 = fruits.get(0)
    println(w1)

    val w2 = fruits[0]
    println(w2)

    val i1 = fruits.indexOf("banana")
    println("The first index of banana is $i1")

    val i2 = fruits.lastIndexOf("banana")
    println("The last index of banana is $i2")

    val i3 = fruits.lastIndex
    println("The last index of the list is $i3")
}