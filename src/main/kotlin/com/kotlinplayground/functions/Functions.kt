package com.kotlinplayground.functions

import java.time.LocalDate

fun main() {
    printName("Attila")

    val result = addition(1,2)

    println("Result: $result")

    val result1 = additionApproach1(1,2)

    println("Result approach 1: $result")

    // Default parameters
    printPersonDetails("Attila", "foo@bar.foo", LocalDate.parse("2000-01-01"))
    printPersonDetails("Attila")

    // named parameters can be used to skip an argument or switch order
    printPersonDetails(name = "Attila", dateOfBirth = LocalDate.parse("2022-01-01"))
}

fun addition(x: Int, y: Int): Int {
    return x + y
}

// simple function with return type inferred
fun additionApproach1(x: Int, y: Int) = x + y


// function parameter
// Unit is same as void, return will be kotlin.Unit a type that represents no value
// Unit return type is inferred
fun printName(name: String): Unit {
    println("Name is: $name")
}

// Default parameters
fun printPersonDetails(
    name: String,
    email: String = "missing",
    dateOfBirth: LocalDate = LocalDate.now()
) {
    println("Name is $name and email is $email and the DoB is $dateOfBirth")
}
