package net.sourcecodeexamples.kotlin

fun main() {

    val nums = listOf(1, 2, 3, 4, 5, 6)

    val nums2 = nums.slice(1..3)
    println(nums2)

    val nums3 = nums.slice(listOf(3, 4, 5))
    println(nums3)
}