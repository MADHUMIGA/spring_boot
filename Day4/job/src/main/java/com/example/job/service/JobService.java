package com.example.job.service;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.job.model.Job;
import com.example.job.repository.JobRepository;


@Service
public class JobService
{
    private final JobRepository jobRepo;
    @Autowired
    JobRepository repo;
    private JobService(JobRepository jobRepo)
    {
        this.jobRepo=jobRepo;
    }
   public Job createJob(Job job)
   {
        return jobRepo.save(job);
   }
   public List<Job> getAllJobs()
   {
    return jobRepo.findAll();
   }
   public Job getJobId(int jobId)
   {
    return jobRepo.findById(jobId).orElse(null);
   }
}
