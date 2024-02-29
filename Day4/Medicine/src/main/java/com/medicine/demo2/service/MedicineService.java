package com.medicine.demo2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.medicine.demo2.model.Medicine;
import com.medicine.demo2.repository.MedicineRepository;


@Service
public class MedicineService {
    private final MedicineRepository medicineRepository;
    // @Autowired
    
    public MedicineService(MedicineRepository medicineRepository) {
        this.medicineRepository = medicineRepository;
    }    
    public Medicine createMedicine(Medicine medicine){
        return medicineRepository.save(medicine);
    }
    public List<Medicine> getAllMedicines(){
        return medicineRepository.findAll();
    }
    public Medicine getMedicineById(int medicineId){
        return medicineRepository.findById(medicineId).orElse(null);
    }
}
