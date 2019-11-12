import org.junit.Test
import org.junit.Assert.*

class TestMonthToSeason {

    @Test
    fun decemberTest() {
        assertEquals("Зима", monthToSeason(12))
    }

    @Test
    fun januaryTest() {
        assertEquals("Зима", monthToSeason(1))
    }

    @Test
    fun februaryTest() {
        assertEquals("Зима", monthToSeason(2))
    }

    @Test
    fun marchTest() {
        assertEquals("Весна", monthToSeason(3))
    }

    @Test
    fun aprilTest() {
        assertEquals("Весна", monthToSeason(4))
    }

    @Test
    fun mayTest() {
        assertEquals("Весна", monthToSeason(5))
    }

    @Test
    fun juneTest() {
        assertEquals("Лето", monthToSeason(6))
    }

    @Test
    fun juleTest() {
        assertEquals("Лето", monthToSeason(7))
    }

    @Test
    fun augustTest() {
        assertEquals("Лето", monthToSeason(8))
    }

    @Test
    fun septemberTest() {
        assertEquals("Осень", monthToSeason(9))
    }

    @Test
    fun octoberTest() {
        assertEquals("Осень", monthToSeason(10))
    }

    @Test
    fun novemberTest() {
        assertEquals("Осень", monthToSeason(11))
    }

    @Test
    fun wrongNumberTest() {
        val monthNumber = 13
        assertEquals("месяц с номером $monthNumber не найден", monthToSeason(monthNumber))
    }

    @Test
    fun numberIsNullTest() {
        assertEquals("номер не был введен", monthToSeason(null))
    }

}