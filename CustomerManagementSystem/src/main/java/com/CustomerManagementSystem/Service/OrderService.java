package com.CustomerManagementSystem.Service;

import com.CustomerManagementSystem.Entity.Customer;
import com.CustomerManagementSystem.Repository.CustomerRepository;
import com.CustomerManagementSystem.Repository.ProductRepository;
import com.CustomerManagementSystem.dto.OrderRequest;
import com.CustomerManagementSystem.dto.OrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    // Create a new order
    public Customer placeOrder(OrderRequest request) {
        return customerRepository.save(request.getCustomer());
    }

    // Read all orders
    public List<Customer> findAllOrders() {
        return customerRepository.findAll();
    }

    // Read an order by ID
    public Optional<Customer> findOrderById(Integer id) {
        return customerRepository.findById(id);
    }

    // Update an existing order
    public Customer updateOrder(Customer customer) {
        return customerRepository.save(customer);  // Save will update if ID exists
    }

    // Delete an order by ID
    public void deleteOrderById(Integer id) {
        customerRepository.deleteById(id);
    }

    // Fetch join information (order details)
    public List<OrderResponse> getJoinInformation() {
        return customerRepository.getJoinInformation();
    }
}
