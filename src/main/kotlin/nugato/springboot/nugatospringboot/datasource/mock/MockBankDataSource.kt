package nugato.springboot.nugatospringboot.datasource.mock

import nugato.springboot.nugatospringboot.datasource.BankDataSource
import nugato.springboot.nugatospringboot.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {

    val banks = mutableListOf(
        Bank("123", 1.0, 1),
        Bank("1010", 17.0, 0),
        Bank("12345", 0.0, 100),
    )

    override fun retrieveBanks(): Collection<Bank> = banks
    override fun retrieveBank(accountNumber: String): Bank = banks.firstOrNull() { it.accountNumber == accountNumber }
        ?: throw NoSuchElementException("Could not find a bank with account number `$accountNumber`")

    override fun createBank(bank: Bank): Bank {
        if (banks.any { it.accountNumber == bank.accountNumber }) {
            throw IllegalArgumentException("Bank with account number `$bank.accountNumber` already exists")
        }

        banks.add(bank)

        return bank
    }
}