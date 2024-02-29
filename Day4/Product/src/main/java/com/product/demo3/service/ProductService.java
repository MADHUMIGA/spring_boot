package com.product.demo3.service;






import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.demo3.model.Product;
import com.product.demo3.repository.ProductRepository;


@Service
public class ProductService {
    @Autowired
    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public Product create(Product obj)
    {
        return productRepository.save(obj);
    }
    public List<Product> getAll()
    {
        return productRepository.findAll();
    }
    public Product getById(int id)
    {
        return productRepository.findById(id).orElse(null);
    }
}