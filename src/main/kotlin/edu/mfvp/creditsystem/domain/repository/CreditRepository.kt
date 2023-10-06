package edu.mfvp.creditsystem.domain.repository

import edu.mfvp.creditsystem.domain.model.Credit
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.UUID

interface CreditRepository : JpaRepository<Credit, Long> {

    fun findByCreditCode(creditCode: UUID): Credit?

    @Query(value = "SELECT * FROM tb_credit WHERE customer_id_fk = ?1", nativeQuery = true)
    fun findAllByCustomerId(customerId: Long): List<Credit>

}