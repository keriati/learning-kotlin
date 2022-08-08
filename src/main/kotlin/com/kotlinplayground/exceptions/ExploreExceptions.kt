package com.kotlinplayground.exceptions

import java.lang.Exception
import java.lang.RuntimeException

fun main() {
    println("Name length is ${nameLength("FooBar")}")
    println("Name length is ${nameLength(null)}")
    returnNothing()
}

fun returnNothing(): Nothing {
    throw RuntimeException("No run")
}

fun nameLength(name: String?): Int? {
    val result = try {
        name!!.length
    } catch (e: Exception) {
        println("Exceptions is $e")
        null
    }

    return result
}
