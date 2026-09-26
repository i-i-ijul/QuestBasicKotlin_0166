fun main() {
    val readOnlyShapes = listOf("segitiga", "kotak", "bulet")
    println(readOnlyShapes)
    val shapes: MutableList<String> = mutableListOf("segitiga", "kotak", "bulet")
    println(shapes)
}