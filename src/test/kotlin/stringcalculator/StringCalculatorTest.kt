package stringcalculator

import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test

internal class StringCalculatorTest {

    @Test
    fun `3 + 7 = 10`() {
        // given
        val stringCalculator = StringCalculator()
        // when
        val result = stringCalculator.run("3,+,7")
        // then
        result shouldBe 10
    }

    @Test
    fun `10 - 7 = 3`() {
        // given
        val stringCalculator = StringCalculator()
        // when
        val result = stringCalculator.run("10,-,7")
        // then
        result shouldBe 3
    }

    @Test
    fun `3 * 7 = 21`() {
        // given
        val stringCalculator = StringCalculator()
        // when
        val result = stringCalculator.run("3,*,7")
        // then
        result shouldBe 21
    }

    @Test
    fun `90 div 9 = 10`() {
        // given
        val stringCalculator = StringCalculator()
        // when
        val result = stringCalculator.run("90,/,9")
        // then
        result shouldBe 10
    }
}