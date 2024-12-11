package com.CustomerManagementSystem.Repository;

import com.CustomerManagementSystem.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
