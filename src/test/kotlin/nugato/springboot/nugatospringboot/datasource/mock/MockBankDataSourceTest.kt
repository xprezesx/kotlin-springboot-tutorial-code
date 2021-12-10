package nugato.springboot.nugatospringboot.datasource.mock

import assertk.assertThat
import assertk.assertions.isGreaterThanOrEqualTo
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {

    private val mockDataSource = MockBankDataSource()

    @Test
    fun `should provide a collection of banks`() {
        // given

        // when
        val banks = mockDataSource.retrieveBanks()

        // then
        assertThat(banks.size).isGreaterThanOrEqualTo(3)
    }

    @Test
    fun `should provide some mock data`() {
        // given
        val banks = mockDataSource.retrieveBanks()

        // when

        // then
        assertTrue(banks.all { it.accountNumber.isNotBlank() })
        assertTrue(banks.any { it.trust != 0.0 })
        assertTrue(banks.any { it.transactionFee != 0 })
    }
}