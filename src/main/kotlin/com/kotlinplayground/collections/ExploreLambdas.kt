package com.kotlinplayground.collections

// Higher order function, a function accepting another function
fun calculate(x: Int, y: Int, op: (x: Int, y: Int) -> Int): Int {
    return op(x, y)
}

fun main() {
    val addLambda = { x: Int -> x + x }
    val addResult = addLambda(5)
    println("Add Result is $addResult")

    val multiplyLambda = { x: Int, y: Int ->
        println("x is $x and y is $y")
        x * y

    }
    val multiplyResult = multiplyLambda(2, 3)
    println("Multiply result is $multiplyResult")

    val calcResult = calculate(2, 3) { a, b -> a * b }

    println("Calc result is $calcResult")
    val calcResultAdd = calculate(2, 3) { a, b -> a + b }

    println("Calc result add is $calcResultAdd")
}