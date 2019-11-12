import org.junit.Test
import org.junit.Assert.*

class TestReverseNumber {

    @Test
    fun reverseThreeDigitTest() {
        val x = 123
        reverseNumber(x)
        assertEquals("321", reverseNumber(x))
    }


    @Test
    fun reverseThreeDigitWithZeroTest() {
        val x = 400
        reverseNumber(x)
        assertEquals("004", reverseNumber(x))
    }
}