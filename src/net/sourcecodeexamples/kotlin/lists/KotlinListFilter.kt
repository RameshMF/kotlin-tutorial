package net.sourcecodeexamples.kotlin

fun main(args: Array<String>) {

	val fruits = listOf("banana", "mango", "apple", "orange")

	val fruits1 = fruits.filter { e -> e.length == 5 }
	fruits1.forEach { e -> print("$e ") }

	println()

	val fruits2 = fruits.filterNot { e -> e.length == 5 }

	fruits2.forEach { e -> print("$e ") }
	println()
}