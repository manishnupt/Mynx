package com.aoct.emr.patient.service;

import com.aoct.emr.patient.entity.Allergy;
import com.aoct.emr.patient.repository.AllergyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllergyService {
    @Autowired
    AllergyRepo allergyRepo;


    public Long addAllergy(Allergy a) {

        Allergy allergy=allergyRepo.save(a);
        if(allergy==null){
            return null;
        }
        else{
            return allergy.getPatientAllergyId();
        }
    }

    public List<Allergy> getPatientAllergy(Long patientId) {
        return allergyRepo.getPatientAllergyById(patientId);
    }
}
