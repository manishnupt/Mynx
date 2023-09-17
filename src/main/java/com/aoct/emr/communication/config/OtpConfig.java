package com.aoct.emr.communication.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.twilio.Twilio;

import jakarta.annotation.PostConstruct;

@Configuration
public class OtpConfig {
	
	 private final TwilioConfig twilioConfig;

	    @Autowired
	    public OtpConfig(TwilioConfig twilioConfig) {
	        this.twilioConfig = twilioConfig;
	    }

	    @PostConstruct
	    public void setup() {
	        Twilio.init(twilioConfig.getAccountSid(), twilioConfig.getAuthToken());
	    }
	}
