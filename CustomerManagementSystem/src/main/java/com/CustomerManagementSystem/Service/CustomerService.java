package com.CustomerManagementSystem.Service;

import com.CustomerManagementSystem.Entity.Customer;
import com.CustomerManagementSystem.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    // Create or Save a customer
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    // Get all customers
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    // Get a customer by ID
    public Optional<Customer> getCustomerById(Integer id) {
        return customerRepository.findById(id);
    }

    // Update a customer
    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);  // Save will update if ID exists
    }

    // Delete a customer by ID
    public void deleteCustomerById(Integer id) {
        customerRepository.deleteById(id);
    }
}
