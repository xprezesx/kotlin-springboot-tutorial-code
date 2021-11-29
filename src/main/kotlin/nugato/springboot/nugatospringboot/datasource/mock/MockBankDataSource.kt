package nugato.springboot.nugatospringboot.datasource.mock

import nugato.springboot.nugatospringboot.datasource.BankDataSource
import nugato.springboot.nugatospringboot.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource: BankDataSource{
    override fun getBanks(): Collection<Bank> {
        TODO("Not yet implemented")
    }
}