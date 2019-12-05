package io.monad

interface Monoid<T> {
    fun mempty(): T

    fun mappend(a: T, b: T): T
}

/* Example String monoid */

class StringMonoid : Monoid<String> {
    override fun mempty(): String = ""

    override fun mappend(a: String, b: String): String = "$a$b"
}