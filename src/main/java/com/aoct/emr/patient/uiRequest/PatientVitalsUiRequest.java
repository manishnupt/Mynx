package com.aoct.emr.patient.uiRequest;
import lombok.Data;

import java.time.LocalDate;


@Data
public class PatientVitalsUiRequest {
    private Long patientId;
    private LocalDate assessmentDate;
    private String weight;
    private String height;
    private String bloodPressure;
    private String pulseRate;
    private String o2Saturation;
    private String temperature;
    private String respirationRate;
    private String bmi;
}
