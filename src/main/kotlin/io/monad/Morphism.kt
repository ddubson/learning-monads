package io.monad

/**
 * This function is a **morphism**, it takes in a type A and returns type B
 */

data class A(val value: Int)

data class B(val value: Int)

fun f(a: A): B {
    return B(a.value + 5)
}

fun main() {
    println("f(A) maps type A to type B")
    println("The domain is the value of A")
    println("The range is the value of A + 5 (represented as value of type B)")

    (1..10).forEach {
        val x = A(it)
        val y = f(x)
        println("for A = $it, f(A) is ${y.value}")
    }
}