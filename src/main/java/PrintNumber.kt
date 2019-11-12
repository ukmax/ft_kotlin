fun main() {
    do {
        val number: Long? = readLine()!!.toLongOrNull()
        if (number !== null) println("Вы ввели число: $number")
    } while (number == null)
}

