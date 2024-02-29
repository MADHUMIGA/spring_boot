package com.example.product_pagination.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.example.product_pagination.model.Product;
import com.example.product_pagination.repository.ProductRepository;



public class ProductService {
    
    @Autowired
    private ProductRepository productRepo;

    public Product create(Product product) {
        return productRepo.save(product);
    }

    public Page <Product> childPagination(int offset,int pageSize){
        return productRepo.findAll(PageRequest.of(offset, pageSize));
    }

    public List<Product> childPaginationSort(int offset,int pageSize,String field){
        PageRequest pageRequest = PageRequest.of(offset, pageSize,Sort.Direction.ASC,field);
        Page<Product> page = productRepo.findAll(pageRequest);
        return page.getContent();
    }

    public Product getId(int id){
        Optional<Product> obj = productRepo.findById(id);
        return obj.orElse(new Product());
    }
}