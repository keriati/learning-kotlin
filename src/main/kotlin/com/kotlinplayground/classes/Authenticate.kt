package com.kotlinplayground.classes

// Object is like Singleton in Java
object Authenticate {
    fun authenticate(userName: String, password: String) {
        println("User authenticated for userName: $userName")

    }
}

fun main() {
    Authenticate.authenticate("Attila", "123")
}