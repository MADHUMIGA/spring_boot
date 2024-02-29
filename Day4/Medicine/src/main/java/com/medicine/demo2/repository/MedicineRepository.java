package com.medicine.demo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicine.demo2.model.Medicine;

public interface MedicineRepository extends JpaRepository<Medicine,Integer> {
    
}
