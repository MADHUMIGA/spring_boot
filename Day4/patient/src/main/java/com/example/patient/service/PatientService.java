package com.example.patient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.patient.model.Patient;
import com.example.patient.repository.PatientRepository;



@Service
public class PatientService {

    private final PatientRepository patientRepo;

    // @Autowired
    public PatientService(PatientRepository patientRepo) {
        this.patientRepo = patientRepo;
    }

    public Patient createPatient(Patient patient) {
        return patientRepo.save(patient);
    }

    public List<Patient> getAllPatients() {
        return patientRepo.findAll();
    }

    public Patient getPatientById(int patientId) {
        return patientRepo.findById(patientId).orElse(null);
    }
}