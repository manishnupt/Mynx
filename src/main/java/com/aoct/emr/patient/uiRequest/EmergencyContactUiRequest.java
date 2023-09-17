package com.aoct.emr.patient.uiRequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmergencyContactUiRequest {
    private Long patientId = 0L;
    private String firstName;
    private String lastName;
    private String relation;
    private String phoneNumber;
    private String ext;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zipCode;
    private String country;

}
