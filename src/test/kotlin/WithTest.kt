import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test

class WithTest {
  @Test
  fun test() {
    val result = with(StringBuilder()) {
      append("1")
      append("2")
    }.toString()

    result shouldBe "12"
  }
}