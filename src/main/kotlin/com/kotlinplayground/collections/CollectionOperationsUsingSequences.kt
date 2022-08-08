package com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.courseList

fun main() {

    val namesListUsingSequence = listOf("Foos", "Bar", "Bazz")
        .asSequence()
        .filter { it.length >= 4 }
        .map { it.uppercase() }
        .toList()

    println("namesListUsingSequence is $namesListUsingSequence")

    val isDevelopment = { c: Course -> c.category == CourseCategory.DEVELOPEMENT }

    exploreFilterUsingSequence(courseList(), isDevelopment)

    val range = 1..1000_000_000

    range
        .asSequence()
        .map { it.toDouble() }
        .take(40)
        .forEach { println("Value is $it") }
}

fun exploreFilterUsingSequence(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {
    courseList
        .asSequence()
        .filter(predicate)
        .forEach {
            println("Dev Course: ${it.name}")
        }
}