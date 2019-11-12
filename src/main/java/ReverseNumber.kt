fun main() {
    println(reverseNumber(120))
}

fun reverseNumber(number: Int): String {
    val reversedInt = number
            .toString()
            .reversed()
            .toInt()
    return String.format("%03d", reversedInt)
}

