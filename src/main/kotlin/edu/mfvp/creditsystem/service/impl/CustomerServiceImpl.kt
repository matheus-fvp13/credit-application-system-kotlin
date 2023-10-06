package edu.mfvp.creditsystem.service.impl

import edu.mfvp.creditsystem.domain.model.Customer
import edu.mfvp.creditsystem.domain.repository.CustomerRepository
import edu.mfvp.creditsystem.service.CustomerService
import org.springframework.stereotype.Service

@Service
class CustomerServiceImpl(
    private val customerRepository: CustomerRepository
): CustomerService {

    override fun save(customer: Customer): Customer = customerRepository.save(customer);

    override fun findById(id: Long): Customer = customerRepository.findById(id).orElseThrow{
            throw RuntimeException("Id $id not found")
    }

    override fun delete(id: Long) = customerRepository.deleteById(id)

}