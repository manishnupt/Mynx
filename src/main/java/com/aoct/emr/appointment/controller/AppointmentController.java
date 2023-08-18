package com.aoct.emr.appointment.controller;

import com.aoct.emr.appointment.UiResponse.AppointmentUiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import com.aoct.emr.appointment.bl.AppointmentBl;
import com.aoct.emr.appointment.uiRequest.AppointmentUiRequest;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/appointment")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class AppointmentController {
	
	@Autowired
	AppointmentBl bl;
	
	@PostMapping("/bookAppointment")
	public Long bookAppointment(@RequestBody AppointmentUiRequest uiRequest)
	{
		return bl.bookAppointment(uiRequest);
	}


	@GetMapping("/getProviderSchedule/{providerId}/{date}")
	public List<AppointmentUiResponse> getProviderSchedule(@PathVariable Long providerId,@PathVariable LocalDate date)

	{

			return bl.getProviderSchedule(providerId, date);

	}

	@GetMapping("/getProviderSchedule/{date}")
	public List<AppointmentUiResponse> getProviderSchedule(@PathVariable LocalDate date){
		return bl.getProviderSchedule(date);
	}

	@GetMapping("/getAppointmentDetail/{appointmentId}")
	public AppointmentUiResponse getAppointmentDetail(@PathVariable Long appointmentId){
		return bl.getAppointmentDetail(appointmentId);
	}

	@GetMapping("/getAppointmentsByMonth/{month}/{year}")
	public List<LocalDate> getAppointmentsByMonth(@PathVariable int month,@PathVariable int year){
		return bl.getAppointmentsByMonth(month,year);
	}

}
