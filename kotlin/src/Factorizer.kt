/*
    Factorizer higher-order function used to "factorize"
    a product of two objects
*/

fun <A, B, C> factorizer(f: (C) -> A, g: (C) -> B): (C) -> Pair<A, B> =
        { Pair(f(it), g(it)) }

fun main() {
    val f: (Int) -> Int = { it + 1 }
    val g: (Int) -> Boolean = { true }

    val m: (Int) -> Pair<Int, Boolean> = factorizer(f, g)
    println(m(5))
}