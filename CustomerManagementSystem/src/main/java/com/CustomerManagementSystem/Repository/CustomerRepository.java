package com.CustomerManagementSystem.Repository;

import com.CustomerManagementSystem.Entity.Customer;
import com.CustomerManagementSystem.dto.OrderResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    //JPA Query
    @Query("SELECT new com.CustomerManagementSystem.dto.OrderResponse(c.name, p.productName) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();

}
