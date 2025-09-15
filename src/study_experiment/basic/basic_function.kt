package study_experiment.basic

fun main() {





}

fun hitungAngka(vararg angka:Int): Int{
    var total = 0
    for (n in angka) {
        total += n
    }
    return total
}

var cobaLambda : (String,Int)->String = { name,umur->
    println("nama saya $name dan $umur")
    name
}


