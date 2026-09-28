package example.myapp

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm "
        )
        // 1 l = 1000 cm^3
        println("Volume: $volume l")
    }

    init {
        println("aquarium initializing")
    }

    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        // calculate the height needed
        height = (tank / (length * width)).toInt()

    }
    sealed class Seal

    class SeaLion : Seal()
    class Walrus : Seal()

    // Función para evaluar los tipos de Seal
    fun matchSeal(seal: Seal): String {
        // En una expresión 'when' con una clase sellada, Kotlin sabe cuál es la lista
        // completa de subclases. No se necesita una rama 'else'.
        return when(seal) {
            is Walrus -> "walrus"
            is SeaLion -> "sea lion"
        }
    }

    fun main() {
        val mySeal: Seal = Walrus()
        println(matchSeal(mySeal)) // Imprime: walrus
    }

}
