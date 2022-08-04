fun main() {

    exploreIfWhen()
    exploreWhile()
    exploreDoWhile()
}

private fun exploreIfWhen() {
    // Range... looks like nubmer array
    val range = 1..10

    for (i in range) {
        println("Line: $i")
    }

    // range backwards
    val range2 = 10.downTo(1)

    // skipping elements
    for (i in range2 step 2) {
        println("Reverse range with skip: $i")
    }
}

fun exploreDoWhile() {
    var i = 0

    // do while
    do {
        println("Value of I is $i")
        i++
    } while (i <5)
}

fun exploreWhile() {

    var x = 1
    // while loop
    while (x <= 5) {
        println("X is $x")
        x++
    }
}
