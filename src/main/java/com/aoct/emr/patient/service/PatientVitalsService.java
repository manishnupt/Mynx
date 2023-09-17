package com.aoct.emr.patient.service;

import com.aoct.emr.patient.entity.Allergy;
import com.aoct.emr.patient.entity.PatientVitals;
import com.aoct.emr.patient.repository.PatientVitalsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientVitalsService {
    @Autowired
    PatientVitalsRepo repo;
    public Long addVitalsForPatient(PatientVitals v) {

        PatientVitals vitals=repo.save(v);
        if(vitals==null){
            return null;
        }
        else{
            return vitals.getVitalsId();
        }
    }

    public List<PatientVitals> getVitalsForPatient(Long patientId) {
        return repo.getVitalsByPatientId(patientId);
    }
}
