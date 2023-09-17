package com.aoct.emr.patient.service;


import com.aoct.emr.patient.entity.PatientEntity;

import com.aoct.emr.patient.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    PatientRepo patientRepo;




    public Long createPatient(PatientEntity patient){

        PatientEntity p=patientRepo.save(patient);

        if(p==null){

            return null;

        }

        else{

            return p.getPatientId();

        }

    }



    @Transactional()

    public PatientEntity getPatientDetails(Long patientId) {

        PatientEntity p=patientRepo.getById(patientId);

        if(p!=null){

            return p;

        }

        return null;

    }



    public List<PatientEntity> getAllPatients() {

        // TODO Auto-generated method stub

        return patientRepo.findAll();



    }



    public boolean updatePatient(PatientEntity patient) {

        PatientEntity updatedPatient = patientRepo.save(patient);

        return updatedPatient != null;

    }


}
