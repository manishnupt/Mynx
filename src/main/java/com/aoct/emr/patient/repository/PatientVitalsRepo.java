package com.aoct.emr.patient.repository;

import com.aoct.emr.patient.entity.PatientVitals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PatientVitalsRepo extends JpaRepository<PatientVitals,Long> {
   @Query("SELECT v FROM PatientVitals v where v.patientId=:patientId")
    List<PatientVitals> getVitalsByPatientId(Long patientId);
}
