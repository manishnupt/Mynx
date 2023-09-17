package com.aoct.emr.patient.uiResponse;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PatientVitalsUiResponse {
//    private Long vitalsId;
//    private Long patientId;
//    private LocalDate assessmentDate;
    private String weight;
    private String height;
    private String bmi;
    private String bloodPressure;
    private String pulseRate;
    private String o2Saturation;
    private String temperature;
    private String respirationRate;
}
