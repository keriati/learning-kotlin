package com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.KAFKA
import com.kotlinplayground.dataset.courseList

fun main() {
    val courseList = courseList()

//    val isDevelopment: (Course) -> Boolean = { it.category == CourseCategory.DEVELOPEMENT }

    val isDevelopment = { c: Course -> c.category == CourseCategory.DEVELOPEMENT }
    val isDesign = { c: Course -> c.category == CourseCategory.DESIGN }
    exploreFilter(courseList, isDevelopment)

    exploreMap(courseList, isDesign)

    exploreFlatMap1()

    val courses = exploreFlatMap2(courseList, KAFKA)

    println("Courses is $courses")
}

fun exploreFlatMap2(courseList: MutableList<Course>, kafka: String): List<String> {
    val kafkaCourses = courseList.flatMap { course ->
        val courseName = course.name
        course.topicsCovered
            .filter {
                it == kafka
            }.map {
                courseName
            }
    }

    return kafkaCourses
}

fun exploreFlatMap1() {
    val LoL = listOf(listOf(1, 2, 3), listOf(4, 5, 6))

    val mappedLol = LoL.map { outerList ->
        outerList.map {
            it.toDouble()
        }
    }

    println("Map Result is $mappedLol")

    val flatMappedLol = LoL.flatMap { outerList ->
        outerList.map {
            it.toDouble()
        }
    }

    println("Flat Map Result is $flatMappedLol")
}

fun exploreMap(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {
    val courses = courseList
        .filter(predicate)
        .map { "${it.name} - ${it.category}" }
        .forEach {
            println(it)
        }
}

fun exploreFilter(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {
    val developmentCourses = courseList
        .filter(predicate)

    developmentCourses
        .forEach {
            println("Dev Course: ${it.name}")
        }
}
