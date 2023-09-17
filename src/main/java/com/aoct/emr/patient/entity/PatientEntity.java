package com.aoct.emr.patient.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class PatientEntity {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "patientId")

    private Long patientId;


    private String npiId;


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

    private String gender;

    private String ssn;

    private String primaryPhoneNumber;

    private String secondaryPhoneNumber;

    private String releaseOfInfo;

    private String empStatus;

    private String ethnicity;

    private String language;

    private String pcp;

    private String pcg;

    private String prescriptionHistoryConsent;

    private String maritalStatus;

    private double outStandingBalance;

    private boolean nkda;

    @Column(columnDefinition = "bytea")
    private byte[] profileImage;


    @Column(nullable = false, columnDefinition = "boolean default true")

    private boolean selfResponsibleFlag;

    private String emailPermission;

    private String textPermission;

    private String voicePermission;

    private String preferredModeOfCommunication;

    @OneToMany(cascade = CascadeType.ALL)

    @JoinColumn(name = "patient_id", referencedColumnName = "patientId")

    private List<EmergencyContact> emergencyContact;



//    @OneToMany(cascade = CascadeType.ALL)

//    private List<Attorney> attorneys;
}
