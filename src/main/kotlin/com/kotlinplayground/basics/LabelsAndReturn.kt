package com.kotlinplayground.basics

fun main() {
    for (i in 1..5) {
        println("i in $i")
        if (i == 3) {
            break
        }
    }

    label()

    for (i in 1..5) {
        println("i in return $i")
        if (i == 3) {
            return
        }
    }

    println("End of program")
}

// you can break out to different labels
fun label() {
    loop@ for (i in 1..5) {
        println("i in label $i")
        if (i == 3) {
            break@loop
        }
        innerLoop@ for(j in 1..5) {
            println("j in label $j")

            if (j == 2) {

                // continue@loop works too!
                break@innerLoop
            }
        }
    }
}
