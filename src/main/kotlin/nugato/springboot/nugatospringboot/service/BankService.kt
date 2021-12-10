package nugato.springboot.nugatospringboot.service

import nugato.springboot.nugatospringboot.datasource.BankDataSource
import nugato.springboot.nugatospringboot.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()
}