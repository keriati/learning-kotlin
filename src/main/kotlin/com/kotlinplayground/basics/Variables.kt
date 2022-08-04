package com.kotlinplayground.basics

import com.kotlinplayground.functions.courseName
import com.kotlinplayground.functions.topLevelFunction

fun main() {
    // Constants
    val name: String = "Attila" // inferred type
    println(name)

    // Variables
    var age: Int = 37  // remove implicit type declaration
    println(age)
    age = 38
    println(age)

    // number types
    val salary = 30000L  // long
    println(salary)

    // string interpolation
    val course = "Kotlin Spring"
    println("course: $course and the course length is ${course.length}")

    // Multiline strings
    val multiLine = "ABC \n DEF"
    println(multiLine)

    val multiLine1 = """
        ABC
        DEF
    """.trimIndent()

    println(multiLine1)

    // importing top level function and variables
    val num = topLevelFunction()

    println("Num is $num course is $courseName")
}