package com.aoct.emr.patient.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Allergy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientAllergyId;


    private String searchAllergy;
    private Long patientId;
    private String reaction;
    private String severity;
    private LocalDate onset;
    private boolean activeAllergy;
    private boolean drugAllergyFlag;
    private int allergyId;
}
