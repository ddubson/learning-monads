package io.monad

interface Writer<A> {
    fun identity(x: A): Pair<A, String>

    fun process(x: A): Pair<A, String>
}

class MultiplyBy10Writer : Writer<Int> {
    override fun identity(x: Int): Pair<Int, String> = Pair(x, "")

    override fun process(x: Int): Pair<Int, String> = Pair(x * 10, "x10!")
}

class AddTwoWriter: Writer<Int> {
    override fun identity(x: Int): Pair<Int, String> = Pair(x, "")

    override fun process(x: Int): Pair<Int, String> = Pair(x + 2, "+2!")
}

fun main() {
    val multiplyResult = MultiplyBy10Writer().process(10)
    val add = AddTwoWriter().process(multiplyResult.first)
    val finalResult = add.first
    println("Final result ${finalResult}")
    println("Steps taken: ${multiplyResult.second} and ${add.second}")
}