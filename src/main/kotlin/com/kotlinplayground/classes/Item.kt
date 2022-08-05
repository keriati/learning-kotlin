package com.kotlinplayground.classes

import java.lang.Exception
import java.lang.IllegalArgumentException

// Secondary constructor
class Item() {
    var name: String = ""
    var price: Double = 0.0
        // custom getter
        get() {
            println("Inside getter")
            return field
        }
        set(value) {
            if (value >= 0.0) {
                field = value
            } else {
                throw IllegalArgumentException("Negative price is not allowed")
            }
        }

    constructor(_name: String) : this() {
        name = _name
    }
}

fun main() {
    val item = Item("iPhone")
    println("Item name is ${item.name}")
    item.price = 10.0

    println(item.price)

    // this throws
    try {
        item.price = -0.1
    } catch (err: Exception) {
        println("Inside catch")
    }
}