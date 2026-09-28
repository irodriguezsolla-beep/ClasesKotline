package example.myapp

fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)
}




fun main() {
    println (decoration1.equals(decoration2))
    println (decoration3.equals(decoration2))

}