package example.myapp
import java.lang.Math
class Manusia(var tinggi:Int = 166, var berat:Int = 70) {
    fun bodyMassIndex():Float{
        var hitung = Math.pow((tinggi.toDouble()/100).toDouble(), 2.0).toFloat()
        return berat/hitung
    }
}