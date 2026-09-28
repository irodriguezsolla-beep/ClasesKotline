package example.myapp.decor

// Paso 1: Clase de datos simple con 1 propiedad
data class Decoration(val rocks: String)

// Paso 2: Clase de datos con 3 propiedades para desestructuración
data class Decoration2(val rocks: String, val wood: String, val diver: String)

fun makeDecorations() {
    println("--- PASO 1: toString() y equals() ---")
    val decoration1 = Decoration("granite")
    println(decoration1) // Imprime: Decoration(rocks=granite)

    val decoration2 = Decoration("slate")
    println(decoration2) // Imprime: Decoration(rocks=slate)

    val decoration3 = Decoration("slate")
    println(decoration3) // Imprime: Decoration(rocks=slate)

    // Comparación estructural con equals()
    println(decoration1.equals(decoration2)) // false
    println(decoration3.equals(decoration2)) // true

    // También podrías usar == (igual a equals())
    // println(decoration1 == decoration2)

    println("\n--- PASO 2: Desestructuración ---")
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

    // Desestructurar las 3 propiedades
    val (rock, wood, diver) = d5
    println(rock)  // crystal
    println(wood)  // wood
    println(diver) // diver

    // Omitir una propiedad con el guion bajo (_)
    val (soloRoca, _, soloBuzo) = d5
    println(soloRoca) // crystal
    println(soloBuzo) // diver

    package example.myapp.decor

    // Enum con valores RGB asociados
    enum class Color(val rgb: Int) {
        RED(0xFF0000),
        GREEN(0x00FF00),
        BLUE(0x0000FF); // Requiere punto y coma si defines métodos o propiedades adicionales
    }

    // Enum con grados de dirección
    enum class Direction(val degrees: Int) {
        NORTH(0),
        SOUTH(180),
        EAST(90),
        WEST(270)
    }

    fun main() {
        // Probando las propiedades por defecto del Enum (name, ordinal) y personalizadas (degrees)
        println(Direction.EAST.name)    // Imprime el nombre exacto de la constante: EAST
        println(Direction.EAST.ordinal) // Imprime la posición basada en índice cero: 2
        println(Direction.EAST.degrees) // Imprime el valor personalizado asignado: 90
    }
}

fun main() {
    makeDecorations()
}
