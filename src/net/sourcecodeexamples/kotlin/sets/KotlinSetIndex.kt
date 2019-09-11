package net.sourcecodeexamples.kotlin

fun main() {

    val fruits = setOf("banana", "mango", "apple", "orange", "banana")

    val w1 = fruits.elementAt(0);
    println(w1)

    val i1 = fruits.indexOf("banana")
    println("The first index of banana is $i1")

    val i2 = fruits.lastIndexOf("banana")
    println("The last index of banana is $i2")
}