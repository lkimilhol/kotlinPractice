package keywords

import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test

internal class PersonTest {
    @Test
    fun `apply`() {
        val person = Person().apply {
            name = "testMan"
            age = 29
            temperature = 40.2f
        }

        person.name shouldBe "testMan"
        person.age shouldBe 29
        person.temperature shouldBe 40.2f
    }
    
    @Test
    fun `run`() {
        val sick = Person().run {
            name = "testMan"
            age = 29
            temperature = 40.2f
            isSick()
        }

        sick shouldBe true
    }

    @Test
    fun `let`() {
        var person: Person? = null
        var result = 1

        person?.let {
            result = 2
        }

        result shouldBe 1

        person = Person()
        person?.let {
            result = 2
        }
        result shouldBe 2
    }

    @Test
    fun `also`() {
        var result = 3
        val person = Person().also {
            result++
        }

        result shouldBe 4
    }
}