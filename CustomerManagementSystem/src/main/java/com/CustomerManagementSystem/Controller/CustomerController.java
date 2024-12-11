package com.CustomerManagementSystem.Controller;

import com.CustomerManagementSystem.Entity.Customer;
import com.CustomerManagementSystem.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    // Create or save a new customer
    @PostMapping("/saveCustomer")
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    // Get all customers
    @GetMapping("/findAllCustomers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    // Get a single customer by ID
    @GetMapping("/{id}")
    public Optional<Customer> getCustomerById(@PathVariable Integer id) {
        return customerService.getCustomerById(id);
    }

    // Update a customer
    @PutMapping("/updateCustomer")
    public Customer updateCustomer(@RequestBody Customer customer) {
        return customerService.updateCustomer(customer);
    }

    // Delete a customer by ID
    @DeleteMapping("/deleteCustomer/{id}")
    public String deleteCustomerById(@PathVariable Integer id) {
        customerService.deleteCustomerById(id);
        return "Customer deleted with ID: " + id;
    }
}
