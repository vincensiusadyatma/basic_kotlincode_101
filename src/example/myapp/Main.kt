package example.myapp

fun buildAquarium() {
    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
    aquarium6.volume = 10
    print(aquarium6.volume)

}
fun main() {
//    buildAquarium()

    var manusia1 = Manusia()
    println(manusia1.bodyMassIndex())
//
//print((166).toDouble()/100)
//    print(Math.pow(166/100,2.0))


}