package com.aoct.emr.patient.controller;

import com.aoct.emr.patient.bl.PatientBl;
import com.aoct.emr.patient.uiRequest.PatientUiRequest;
import com.aoct.emr.patient.uiResponse.PatientUiResponse;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import java.util.List;

@RestController
@RequestMapping("/api/patient")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class PatientController {

	@Autowired
	PatientBl bl;



	@Operation(summary = "This endpoint is used to create patient")
	@PostMapping("/createPatient")
	public Long createPatient(@RequestBody PatientUiRequest patientUiRequest) {

		return bl.createPatient(patientUiRequest);

	}
	@Operation(summary = "This endpoint is used to view patient details")
	@GetMapping("/getPatientDetails/{patientId}")
	public PatientUiResponse getPatientDetails(@PathVariable Long patientId) {



		return bl.getPatientDetails(patientId);

	}
	@GetMapping("/getAllPatients")
	public List<PatientUiResponse> getAllPatients() {

		return bl.getAllPatients();

	}

}
