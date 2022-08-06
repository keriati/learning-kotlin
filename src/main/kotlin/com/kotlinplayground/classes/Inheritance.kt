package com.kotlinplayground.classes

// open keyword allows inheritance from a class
open class User(val name: String) {
    // override variable
    open var isLoggedIn: Boolean = false

    open fun login() {
        println("Inside User login")
    }
}

// constructor arg is passed
class Student(name: String) : User(name) {
    // override variable
    override var isLoggedIn: Boolean = true

    override fun login() {
        println("Inside student login")
        super.login()
    }
}

class Instructor(name: String) : User(name)

fun main() {
    val student = Student("Alex")
    println("name is ${student.name}")
    student.login()

    val instructor = Instructor("Attila")
    println("name is ${instructor.name}")
    instructor.login()
}