package edu.mfvp.creditsystem.service

import edu.mfvp.creditsystem.domain.model.Credit
import java.util.UUID

interface CreditService {

    fun save(credit: Credit): Credit
    fun findAllByCustomer(customerId: Long): List<Credit>
    fun findByCreditCode(customerId: Long, creditCode: UUID): Credit

}