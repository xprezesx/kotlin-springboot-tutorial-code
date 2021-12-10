package nugato.springboot.nugatospringboot.service

import io.mockk.mockk
import io.mockk.verify
import nugato.springboot.nugatospringboot.datasource.BankDataSource
import org.junit.jupiter.api.Test

internal class BankServiceTest {

    private val dataSource: BankDataSource = mockk(relaxed = true)
    private val banksService = BankService(dataSource)

    @Test
    fun `should call its data source to retrieve banks`() {
        // when
        banksService.getBanks()

        // then
        verify(exactly = 1) { dataSource.retrieveBanks() }
    }
}