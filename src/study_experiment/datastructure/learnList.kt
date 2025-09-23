package study_experiment.datastructure
import java.util.Arrays
fun main() {
    var list1 = listOf(1,2,3,4)
    val numbers = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers
    print(list1)
    print(Arrays.toString(foo2))
}