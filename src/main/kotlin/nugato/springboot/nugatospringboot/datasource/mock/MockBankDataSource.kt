package nugato.springboot.nugatospringboot.datasource.mock

import nugato.springboot.nugatospringboot.datasource.BankDataSource
import nugato.springboot.nugatospringboot.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource: BankDataSource{

    val banks = listOf(
        Bank("123", 1.0, 1),
        Bank("1010", 17.0, 0),
        Bank("12345", 0.0, 100),
    )

    override fun retrieveBanks(): Collection<Bank> = banks
}