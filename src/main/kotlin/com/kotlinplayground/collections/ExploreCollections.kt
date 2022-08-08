package com.kotlinplayground.collections

fun main() {
    // Mutable ant immutable lists
    val names = listOf("Foo", "Bar", "Baz")
    println("Names is $names")

    val namesMutable = mutableListOf("Foo", "Bar", "Baz")
    namesMutable.add("Yoo")
    println("Names is $namesMutable")

    // Mutable and immutable sets
    val setOfNames = setOf("Foo", "Bar", "Baz")
    println("Set is $setOfNames")

    val setOfNamesMutable = mutableSetOf("Foo", "Bar", "Baz")
    setOfNamesMutable.add("Yoo")
    println("Set is $setOfNamesMutable")

    // Mutable and immutable hashmaps
    val fooMap = mapOf("Foo" to 1, "Bar" to 2, "Baz" to 3)
    println("Map is $fooMap")

    val fooMapMutable = mutableMapOf("Foo" to 1, "Bar" to 2, "Baz" to 3)
    fooMapMutable["Yoo"] = 4
    println("Map is $fooMapMutable")
}