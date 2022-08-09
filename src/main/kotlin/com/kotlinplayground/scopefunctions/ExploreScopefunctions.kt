package com.kotlinplayground.scopefunctions

import com.kotlinplayground.classes.Course
import com.kotlinplayground.classes.CourseCategory

fun main() {
//    exploreApply()
//    exploreAlso()
//    exploreLet()
//    exploreWith()
    exploreRun()
}

fun exploreRun() {

    var numbers: MutableList<Int>? = null

    // when we also do object initialisation
    val result = numbers.run {
        numbers = mutableListOf(1, 2, 3)
        numbers?.sum()
    }

    println("Run result is $result")

    val length = run {
        val name = "Alex"
        println(name)
        name.length
    }

    println("Run length is $length")
}

fun exploreWith() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)

    // calling functions on the context object itself
    val result = with(numbers) {
        println("Size is $size")
        val list = plus(6)
        list.sum()
    }

    println("With result is $result")
}


fun exploreLet() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    val result = numbers.map { it * 2 }.filter { it > 5 }.let {
        println("Number is: $it")
        it.sum()
    }

    println(result)

    var name: String? = null

    name = "Alex"

    val result1 = name?.let {
        println(it)
        it.uppercase()
    }

    println(result1)
}

fun exploreApply() {
    val myCourse = Course(
        1,
        "Foo Bar Baz course",
        "FooBar"
    ).apply {
        // this is set to the object, properties are available in the scope
        courseCategory = CourseCategory.DESIGN
    }

    println("Course is $myCourse")
}

// Also is for executing side effects
fun exploreAlso() {
    val myCourse = Course(
        1,
        "Foo Bar Baz course",
        "FooBar"
    ).also {
        println("Course is $it")
    }
}
