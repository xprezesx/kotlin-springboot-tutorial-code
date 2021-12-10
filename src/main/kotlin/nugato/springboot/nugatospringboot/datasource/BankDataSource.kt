package nugato.springboot.nugatospringboot.datasource

import nugato.springboot.nugatospringboot.model.Bank

interface BankDataSource {
    fun retrieveBanks(): Collection<Bank>
    fun retrieveBank(accountNumber: String): Bank
}