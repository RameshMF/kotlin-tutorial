package net.sourcecodeexamples.kotlin

fun main() {

    val nums = listOf(1,2,-1,-2,3,4,5,6,7,8,9,10)

    val nums2 = nums.drop(3)
    println(nums2)

    val nums3 = nums.dropLast(3)
    println(nums3)

    val nums4 = nums.sorted().dropWhile { e -> e < 0 }
    println(nums4)

    val nums5 = nums.sorted().dropLastWhile { e -> e > 0 }
    println(nums5)
}