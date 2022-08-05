package com.kotlinplayground.classes

// Secondary constructor
class Item() {
    var name : String = ""

    constructor(_name: String) : this() {
        name = _name
    }
}

fun main() {
    val item = Item("iPhone")
    println("Item name is ${item.name}")
}