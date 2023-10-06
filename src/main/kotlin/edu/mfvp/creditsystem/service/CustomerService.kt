package edu.mfvp.creditsystem.service

import edu.mfvp.creditsystem.domain.model.Customer

interface CustomerService {

    fun save(customer: Customer): Customer
    fun findById(id: Long): Customer
    fun delete(id: Long)

}