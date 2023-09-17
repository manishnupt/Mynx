package com.aoct.emr.communication.bl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aoct.emr.communication.response.OtpUiResponse;
import com.aoct.emr.communication.service.SmsService;
import com.aoct.emr.communication.uiRequest.OtpUiRequest;
import com.aoct.emr.communication.uiRequest.OtpValidationRequest;

@Component
public class CommunicationBl {
	
	@Autowired
	SmsService service;

	public OtpUiResponse sendSMS(OtpUiRequest otpRequest) {
		// TODO Auto-generated method stub
		return service.sendSMS(otpRequest);
	}

	public String validateOtp(OtpValidationRequest otpValidationRequest) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
