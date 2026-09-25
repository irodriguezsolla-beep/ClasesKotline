package example.myapp

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    val volume: Int
        get() = width * height * length / 1000  // 1000 cm^3 = 1 l

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

}
