package com.kotlinplayground.nulls

data class Movie(
    val id: Int?,
    val name: String,
)

fun main() {
    var nameNullable: String? = null

    println("Value is $nameNullable")

    nameNullable = "Alex"

    println("Value is $nameNullable")

    val movie = Movie(null, "Godfather")
    val savedMovie = saveMovie(movie)

    println("Saved movie is $savedMovie")
}

fun saveMovie(movie: Movie): Movie {
    return movie.copy(id = 1)
}
