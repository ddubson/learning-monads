class WriterComposer<A, B, C> {
    fun compose(f: (A) -> Writer<B>, g: (B) -> Writer<C>): (A) -> Writer<C> = { x ->
        val p1: Writer<B> = f(x)
        val p2: Writer<C> = g(p1.item)
        Writer(p2.item, "${p1.message}, ${p2.message}")
    }
}
