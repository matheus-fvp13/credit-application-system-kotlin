package edu.mfvp.creditsystem.service.impl

import edu.mfvp.creditsystem.domain.model.Credit
import edu.mfvp.creditsystem.domain.repository.CreditRepository
import edu.mfvp.creditsystem.service.CreditService
import edu.mfvp.creditsystem.service.CustomerService
import java.util.*

class CreditServiceImpl(
    private val creditRepository: CreditRepository,
    private val customerService: CustomerService
): CreditService {
    override fun save(credit: Credit): Credit {
        credit.apply {
            customer = customerService.findById(credit.customer?.id!!)
        }
        return creditRepository.save(credit)
    }

    override fun findAllByCustomer(customerId: Long): List<Credit> = creditRepository.findAllByCustomerId(customerId)

    override fun findByCreditCode(customerId: Long, creditCode: UUID): Credit {
        val credit: Credit = creditRepository.findByCreditCode(creditCode)
            ?: throw RuntimeException("Creditcode  $creditCode not found")
        return if(credit.customer?.id == customerId) credit else throw RuntimeException("Contact admin")
    }

}