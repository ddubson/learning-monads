package io.monad

fun main(args: Array<String>) {
   // Composer example
    val f: (String) -> String = { "$it World" }
    val g: (String) -> String = { "$it !!" }
    val composed = Composer<String, String, String>().compose(f, g)
    val helloWorld = composed("Hello");
    println("Composition example: $helloWorld");
}
