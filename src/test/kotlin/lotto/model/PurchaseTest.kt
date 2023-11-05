package lotto.model

import camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class PurchaseTest {
    @Test
    @DisplayName("유효하지 않은 값이 들어가면 예외가 발생한다.")
    fun constructorTest() {
        assertSimpleTest {
            assertThrows<IllegalArgumentException> {
                Purchase(3021)
            }

            assertThrows<IllegalArgumentException> {
                Purchase(1001)
            }

            assertThrows<IllegalArgumentException> {
                Purchase(-1000)
            }
        }
    }

    @Test
    @DisplayName("유효한 값이 들어가면 1000원으로 나눈 값으로 초기화한다.")
    fun validConstructTest() {
        val purchaseCount = Purchase(8000)
        val validation = purchaseCount.count
        val result = 8
        assertThat(validation).isEqualTo(result)
    }
}