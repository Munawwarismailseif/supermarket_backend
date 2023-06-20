package com.msystem.SupermarketManagementSystem.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.msystem.SupermarketManagementSystem.controller.ProductController;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Getter
@Setter
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Product {
    @Id
    private String id = UUID.randomUUID().toString();
    private String name;
    private Double price;

    public Product(){

    }

    public Product(String id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
