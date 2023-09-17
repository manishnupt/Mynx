package com.aoct.emr.patient.uiRequest;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AllergyUiRequest {

    private int allergyId;
    private Long patientId;
    private String reaction;
    private String severity;
    private LocalDate onset;
    private boolean activeAllergy;
    private boolean drugAllergyFlag;
    private String searchAllergy;
}
