package com.kotlinplayground.classes

// open keyword allows inheritance from a class
open class User(val name: String) {
    // override variable
    open var isLoggedIn: Boolean = false

    open fun login() {
        println("Inside User login")
    }

    // only visible in the class
    private fun secret() {
        println("Inside user login")
    }

    // only visible in child
    protected open fun logout() {
        println("Inside user logout")
    }
}

// constructor arg is passed
class Student(name: String) : User(name) {
    // override variable
    override var isLoggedIn: Boolean = true

    // Static methods and constants are in companion objects
    companion object {
        const val noOfCourses = 10

        fun country() = "Korea"
    }

    override fun login() {
        println("Inside student login")
        super.login()
    }

    // protected function is visible from parent
    override fun logout() {
        super.logout()
        println("Inside Student logout")
    }
}

class Instructor(name: String) : User(name)

fun main() {
    val student = Student("Alex")
    println("name is ${student.name}")
    student.login()

    val country = Student.country()

    println("Country is $country")
    println("No of courses is ${Student.noOfCourses}")

    val instructor = Instructor("Attila")
    println("name is ${instructor.name}")
    instructor.login()

    val user = User("Alex")
}