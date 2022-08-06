package com.kotlinplayground.cast

import com.kotlinplayground.classes.Course

fun main() {
    val course = Course(1, "Foo bar course", "Alex")

    checkType(course)
    checkType("Attila")

    castNumber(1.0)

    // not possible to cast -> throws exception
    //castNumber(1)

    val myNumber = 1
    // type conversion has to be explicit
    val myNumberDouble = myNumber.toDouble()

    println(myNumberDouble)

}

fun castNumber(any: Any) {
    when (any) {
        // in case of successful casting we get true
        any as Double -> println("Value is double")
    }
}

fun checkType(type: Any) {
    // type narrowing works / smart casting
    when (type) {
        //type checking
        is Course -> {
            println(type)
        }

        is String -> {
            println(type.lowercase())
        }
    }
}
