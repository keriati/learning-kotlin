package com.kotlinplayground.basics

fun main() {
    val name = "Alex"

    //name = "Chloe"

    // In kotlin if else block is an expression, returning the last statement
    val result = if (name.length == 4) {
        println("Name is Four Characters")
        name.length
    } else {
        println("Name is not Four Characters")
        name.length
    }

    println("Result: $result")

    // if else with returns
    var position = 1
    val medal = if (position == 1) {
        "GOLD"
    } else if (position == 2) {
        "SILVER"
    } else if (position == 3) {
        "BRONZE"
    } else {
        "NO MEDAL"
    }
    // When block
    position = 2
    val medal2 = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }

    println(medal)
    println(medal2)
}