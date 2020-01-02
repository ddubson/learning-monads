/*
f is an arrow that maps object A to object B
g is a arrow that maps object B to object C
compose method's job is to take in arrow f and arrow g and return a new arrow
    mapping object A to object C
 */
fun <A, B, C> compose(f: (A) -> B, g: (B) -> C): (A) -> C = { x ->
    val p1: B = f(x)
    val p2: C = g(p1)
    p2
}

fun main() {
    // Composer example
    val f: (String) -> String = { "$it World" }
    val g: (String) -> String = { "$it !!" }
    val gAfterf = compose(f, g)
    val helloWorld = gAfterf("Hello");
    println("Composition example: $helloWorld");
}
