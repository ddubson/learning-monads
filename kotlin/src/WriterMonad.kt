data class Writer<T>(val item: T, val message: String)

fun main() {
    val writerComposer = WriterComposer<Int, Int, Int>()
    val f: (Int) -> Writer<Int> = { Writer(it + 5, "value is $it (f morphism called)")}
    val g: (Int) -> Writer<Int> = { Writer(it + 10, "value is now $it (g morphism called)")}
    val h: (Int) -> Writer<Int> = writerComposer.compose(f, g)
    println(h(4))
}