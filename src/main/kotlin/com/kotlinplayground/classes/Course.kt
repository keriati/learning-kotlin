package com.kotlinplayground.classes

// Data class, domain classes, value object classes, DTO, similar to Java Beans
data class Course(
    val id: Int,
    val name: String,
    val author: String
)

fun main() {
    val course = Course(1,"Attila was here", "Attila")

    println(course.toString())

    val course1 = Course(1,"Attila was here", "Attila")

    println("Checking equality: ${course == course1}")

    val copyCourse = course1.copy(id=2)

    println("Course copy: $copyCourse")
}