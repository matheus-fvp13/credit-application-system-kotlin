package edu.mfvp.creditsystem.domain.repository

import edu.mfvp.creditsystem.domain.model.Customer
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepository : JpaRepository<Customer, Long> {
}