fun main() {
    println("Введите номер месяца")
    val number: Int? = readLine()!!.toIntOrNull()
    println(monthToSeason(number))
}

fun monthToSeason(monthNumber: Int?): String {
    when (monthNumber) {
        1, 2, 12 -> return "Зима"
        3, 4, 5 -> return "Весна"
        6, 7, 8 -> return "Лето"
        9, 10, 11 -> return "Осень"
    }
    if (monthNumber == null) return "номер не был введен"
    return "месяц с номером $monthNumber не найден"

}