package com.example.product_pagination.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.product_pagination.model.Product;


public interface ProductRepository extends JpaRepository<Product,Integer>{
    
}