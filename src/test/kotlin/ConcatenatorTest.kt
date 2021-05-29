import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ConcatenatorTest {

    private val sut: Concatenator = Concatenator()

    @Test
    fun testConcat() {
        val expected = "Hello arconsis"
        assertEquals(expected, sut.concatenate("Hello", "arconsis"))
    }

    @Test
    fun testConcatWithReverse() {
        val expected = "dlroW olleH"
        assertEquals(expected, sut.concatenateAndReverse("Hello", "World"))
    }
}

