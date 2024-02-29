package com.product.demo3.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.demo3.model.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product ,Integer>{
}