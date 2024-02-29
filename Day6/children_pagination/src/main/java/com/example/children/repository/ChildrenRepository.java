package com.example.children.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.children.model.Children;

public interface ChildrenRepository extends JpaRepository<Children,Integer> {

    
}
