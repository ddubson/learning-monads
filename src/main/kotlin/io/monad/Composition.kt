package io.monad

class Composer<A, B, C> {
    fun compose(f: (A) -> B, g: (B) -> C): (A) -> C = { x ->
        val p1: B = f(x)
        val p2: C = g(p1)
        p2
    }
}
