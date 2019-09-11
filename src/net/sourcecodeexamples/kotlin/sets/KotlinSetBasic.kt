package net.sourcecodeexamples.kotlin

fun main() {

    val nums = setOf(1, 15, 13, 8, 1, 19, 6, 12)

    val len = nums.count()
    val max = nums.max()
    val min = nums.min()
    val sum = nums.sum()
    val avg = nums.average()

    val msg = """
               max: $max, min: $min,
               count: $len, sum: $sum,
               average: $avg
              """
    println(msg.trimIndent())

}