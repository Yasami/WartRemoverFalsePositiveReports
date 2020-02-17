final case class Foo(
    a: Boolean = false,
    b: Boolean = false,
    c: Boolean = false,
    d: Boolean = false,
)

object Foo {
    val a: Foo = Foo(a = true)
    val b: Foo = Foo(b = true)
    val c: Foo = Foo(c = true)
    val d: Foo = Foo(d = true)
}
