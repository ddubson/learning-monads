package io.monad

class Composer<A, B, C> {
    /*

    f is an arrow that maps object A to object B
    g is a arrow that maps object B to object C
    compose method's job is to take in arrow f and arrow g and return a new arrow
        mapping object A to object C

     */
    fun compose(f: (A) -> B, g: (B) -> C): (A) -> C = { x ->
        val p1: B = f(x)
        val p2: C = g(p1)
        p2
    }
}
