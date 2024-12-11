package com.CustomerManagementSystem.Controller;

import com.CustomerManagementSystem.Entity.Customer;
import com.CustomerManagementSystem.Service.OrderService;
import com.CustomerManagementSystem.dto.OrderRequest;
import com.CustomerManagementSystem.dto.OrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    // Create a new order
    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest request) {
        return orderService.placeOrder(request);
    }

    // Read all orders
    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders() {
        return orderService.findAllOrders();
    }

    // Read a single order by ID
    @GetMapping("/{id}")
    public Optional<Customer> findOrderById(@PathVariable Integer id) {
        return orderService.findOrderById(id);
    }

    // Update an existing order
    @PutMapping("/updateOrder")
    public Customer updateOrder(@RequestBody Customer customer) {
        return orderService.updateOrder(customer);
    }

    // Delete an order by ID
    @DeleteMapping("/deleteOrder/{id}")
    public String deleteOrderById(@PathVariable Integer id) {
        orderService.deleteOrderById(id);
        return "Order deleted with ID: " + id;
    }

    // Get join information (order details)
    @GetMapping("/getInfo")
    public List<OrderResponse> getJoinInformation() {
        return orderService.getJoinInformation();
    }
}
