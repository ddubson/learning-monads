import arrow.core.Either
import arrow.core.Left
import arrow.core.Right

/*
    Factorizer higher-order function used to "factorize"
    a product of two objects
*/

fun <A, B, C> factorizer(f: (C) -> A, g: (C) -> B): (C) -> Pair<A, B> =
        { Pair(f(it), g(it)) }

// Inverse of factorizer
fun <A, B, C> coProductFactorizer(f: (A) -> C, g: (B) -> C): (Either<A, B>) -> C = { eitherOf ->
    eitherOf.fold(
            { left -> f(left) },
            { right -> g(right) }
    )
}

fun factorizerExample() {
    val f: (Int) -> Int = { it + 1 }
    val g: (Int) -> Boolean = { true }

    val m: (Int) -> Pair<Int, Boolean> = factorizer(f, g)
    println("Product Factorizer example - creates a Pair")
    println(m(5))
}

fun coProductFactorizerExample() {
    val f: (Int) -> (Int) = { it + 5 }
    val g: (String) -> (Int) = { it.length }
    val h: (Either<Int, String>) -> (Int) = coProductFactorizer(f, g)
    println("CoProduct Factorizer example")
    println("H arrow (left) value is: ${h(Left(10))}")
    println("H arrow (right) value is: ${h(Right("Some string"))}")
}


fun main() {
    factorizerExample()
    coProductFactorizerExample()
}