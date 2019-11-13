import java.util.Arrays

fun main() {
    val numbers: Array<Int> = arrayOf(9, -5, -8, 1, 0, 6, -1, -1)
    getSortedArray(numbers)
    println(Arrays.toString(getSortedArray(numbers)))
}

fun getSortedArray(numbers: Array<Int>): Array<Int?> {
    val sortedArray: Array<Int?> = arrayOfNulls(numbers.size)
    numbers.sort()
    for (i in 0 until numbers.size) {
        sortedArray[i] = numbers[i]
    }
    return sortedArray

}