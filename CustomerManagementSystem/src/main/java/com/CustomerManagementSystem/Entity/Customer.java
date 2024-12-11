package com.CustomerManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customer {

    @Id
    @GeneratedValue
    @Column(name = "cid")
    private Integer id;

    private String name;
    private String email;
    private String gender;

    //A customer have many product
    //One to Many Relation
    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "cusId",referencedColumnName = "cid")
    private List<Product> products;

}
