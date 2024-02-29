package com.example.job.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.job.model.Job;



@Repository
public interface JobRepository extends JpaRepository<Job,Integer>{

    
  
}
