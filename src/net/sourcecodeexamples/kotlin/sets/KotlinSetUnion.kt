package net.sourcecodeexamples.kotlin

fun main(args: Array<String>) {

    val nums = setOf(1, 2, 3, 4,5)
    val nums2 = setOf(3, 4, 5,6,7,8,9)

    val nums3 = nums.union(nums2)

    println(nums3)
}