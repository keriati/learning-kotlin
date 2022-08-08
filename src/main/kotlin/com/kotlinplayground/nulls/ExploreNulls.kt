package com.kotlinplayground.nulls

data class Movie(
    val id: Int?,
    val name: String,
)

fun printName(name: String) {
    println("Name is: $name")
}

fun printName1(name: String?) {
    println("Name is: $name")
}

fun main() {
    var nameNullable: String? = null

    // run scope function will execute when its not null
    nameNullable?.run {
        printName(this)
    }
//    if (nameNullable != null) {
//        println("Value is ${nameNullable.length}")
//    }

    // safe operator is "?"
    println("Value is ${nameNullable?.length}")

    // Elvis operator for default value assignment
    var length = nameNullable?.length ?: 0

    nameNullable = "Alex"
    println("Value is $nameNullable")

    var name: String = "FooBar"
    printName1(name)

    val movie = Movie(null, "Godfather")
    val savedMovie = saveMovie(movie)
    println(savedMovie.id!!) // non null assertions
    println("Saved movie is $savedMovie")
}

fun saveMovie(movie: Movie): Movie {
    return movie.copy(id = 1)
//    return movie
}
