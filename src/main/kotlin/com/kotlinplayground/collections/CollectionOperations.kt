package com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.courseList

fun main() {
    val courseList = courseList()

//    val isDevelopment: (Course) -> Boolean = { it.category == CourseCategory.DEVELOPEMENT }

    val isDevelopment = { c: Course -> c.category == CourseCategory.DEVELOPEMENT }
    val isDesign = { c: Course -> c.category == CourseCategory.DESIGN }
//    exploreFilter(courseList, isDevelopment)
//
//    exploreMap(courseList, isDesign)
//
//    exploreFlatMap1()
//
//    val courses = exploreFlatMap2(courseList, KAFKA)
//
//    println("Courses is $courses")

//    exploreHashMap()

    collectionsNullability()
}

fun collectionsNullability() {
    var list: MutableList<String>? = null

    list = mutableListOf()
    list.add("Foo")
    list?.forEach {
        println("Value is $it")
    }

    val list1: List<String?> = listOf("Foo", null, "Bar")
    list1.forEach{
        println("Value is ${it?.length ?: 0}")
    }
}

fun exploreHashMap() {
    val nameAgeMutableMap = mutableMapOf("Foo" to 33, "Bar" to 5)

    nameAgeMutableMap.forEach { (k, v) ->
        println("Key as $k and the value is $v")
    }

    val myValue = nameAgeMutableMap.getOrElse("Foo1") { "abc" }
    println("My Value is $myValue")

    println("Key present: ${nameAgeMutableMap.containsKey("abc")}")

    nameAgeMutableMap.filterKeys { it.length > 2 }
        .map { it.key.uppercase() }
        .forEach{ println(it) }

    println("max age is ${nameAgeMutableMap.maxByOrNull { it.value }}")
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
