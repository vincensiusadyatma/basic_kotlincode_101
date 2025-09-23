package example.myapp

class Aquarium(length: Int = 100, width: Int = 20, height: Int = 40) {
    var width :Int = length
    var height :Int = width
    var length :Int = height

    var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }


    constructor(numberOfFish: Int) : this() {
        println("second")
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        // calculate the height needed
        height = (tank / (length * width)).toInt()
    }

    init{
        println("install object")
    }
    fun printSize() {

        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }

}