import org.junit.Test
import org.junit.Assert.assertTrue

class TestSortArray {

    @Test
    fun sortArrayTest() {
        val arrayForSort: Array<Int> = arrayOf(9, -5, -8)
        val arrayForCheck: Array<Int> = arrayOf(-8, -5, 9)
        getSortedArray(arrayForSort)
        assertTrue("содержимое массива не совпало с проверочным", arrayForCheck.contentEquals(getSortedArray(arrayForSort)))
    }
}