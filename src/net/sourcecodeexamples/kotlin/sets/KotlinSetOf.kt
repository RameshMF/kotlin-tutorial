package net.sourcecodeexamples.kotlin

fun main() {
	// Set contains unique elements
	val theSet = setOf("one", "two", "three", "one")
	println(theSet)
	println("The set contains ${theSet.size} elements.")
	val theMutableOf = mutableSetOf("one", "two", "three")
	println(theMutableOf)
}