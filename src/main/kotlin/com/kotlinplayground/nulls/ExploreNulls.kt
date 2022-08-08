package com.kotlinplayground.nulls

data class Movie(
    val id: Int?,
    val name: String,
)

fun main() {
    var nameNullable: String? = null

//    if (nameNullable != null) {
//        println("Value is ${nameNullable.length}")
//    }

    // safe operator is "?"
    println("Value is ${nameNullable?.length}")

    // Elvis operator for default value assignment
    var length = nameNullable?.length ?: 0


    nameNullable = "Alex"

    println("Value is $nameNullable")

    val movie = Movie(null, "Godfather")
    val savedMovie = saveMovie(movie)

    println("Saved movie is $savedMovie")
}

fun saveMovie(movie: Movie): Movie {
    return movie.copy(id = 1)
}
