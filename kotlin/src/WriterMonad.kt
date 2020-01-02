// Writer type
data class Writer<T>(val item: T, val message: String)

// Writer type identity morphism
fun <T> identity(item: T): Writer<T> = Writer(item, "")

fun main() {
    val f: (Int) -> Writer<Int> = { Writer(it + 5, "value is $it (f morphism called)")}
    val g: (Int) -> Writer<Int> = { Writer(it + 10, "value is now $it (g morphism called)")}
    val h: (Int) -> Writer<Int> = compose(f, g)
    println(h(4))
}