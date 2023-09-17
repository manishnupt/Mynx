package com.aoct.emr.patient.uiResponse;

import com.aoct.emr.appointment.UiResponse.AppointmentUiResponse;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class PatientUiResponse {
    private Long patientId;
    private int accountNo;
    private String prefix;
    private String lastName;
    private String suffix;
    private String firstName;
    private String middleName;

    private String preferredName;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String county;
    private String zip;
    private String country;
    private String email;
    private LocalDate dateOfBirth;
    private String Gender;
    private String ssn;
    private String primaryPhoneNumber;
    private String secondaryPhoneNumber;
    private  String releaseOfInfo;
    private String empStatus;
    private String ethnicity;
    private String language;
    private String pcp;
    private String pcg;
    private String prescriptionHistoryConsent;
    private String maritalStatus;
    private double outStandingBalance;
    //private List<MedicalHistoryUiResponse> medicalHistory;
    private List<EmergencyContactUiResponse> emergencyContacts;
    private String profileImage;
//    private ReferringProviderUiResponse referringProvider;
    private String emailPermission;
    private String textPermission;
    private String voicePermission;
    private String preferredModeOfCommunication;
    private boolean selfResponsibleflag;
    private List<AppointmentUiResponse> appointments;

    private boolean nkda;

//    private List<AttorneyUiResponse> attorney=new ArrayList<AttorneyUiResponse>();
}
