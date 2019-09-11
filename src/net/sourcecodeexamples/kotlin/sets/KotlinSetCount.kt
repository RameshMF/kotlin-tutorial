package net.sourcecodeexamples.kotlin

fun main() {

    val nums = setOf(12, 1,2,5,4,2)

    val len = nums.count()
    println("There are $len elements")
    
    val size = nums.size
    println("The size of the list is $size")    

    val n1 = nums.count { e -> e < 0 }
    println("There are $n1 negative values")

    val n2 = nums.count { e -> e % 2 == 0 }
    println("There are $n2 even values")
}