package com.kotlinplayground.classes

// Primary constructor
class Person(
    val name: String = "",
    val age: Int = 0
) {
    var email: String = ""
    var nameLength: Int = 0

    init {
        println("Inside the init block")
        nameLength = name.length
    }

    // secondary constructor
    constructor(
        _email: String,
        _name: String = "",
        _age: Int = 0
    ) : this(_name, _age) {
        email = _email
        nameLength = name.length
    }

    fun action() {
        println("Person Walks")
    }
}

fun main() {
//    val person = Person("Attila", 30)
//    person.action()
//    println("Name: ${person.name} Age: ${person.age}")
//
//    val person1 = Person()
//    println("Name: ${person1.name} Age: ${person1.age}")

    val person2 = Person(_email = "foo@bar.foo", "Attila", 23)
    println("Name: ${person2.name} Age: ${person2.age} Email: ${person2.email} NameLength: ${person2.nameLength}")
}