package edu.mfvp.creditsystem.domain.repository

import edu.mfvp.creditsystem.domain.model.Credit
import org.springframework.data.jpa.repository.JpaRepository

interface CreditRepository : JpaRepository<Credit, Long> {
}