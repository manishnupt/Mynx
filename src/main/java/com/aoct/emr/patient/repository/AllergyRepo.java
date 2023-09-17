package com.aoct.emr.patient.repository;

import com.aoct.emr.patient.entity.Allergy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AllergyRepo extends JpaRepository<Allergy,Long> {

    @Query("SELECT a from Allergy a where a.patientId=:patientId")
    List<Allergy> getPatientAllergyById(Long patientId);
}
