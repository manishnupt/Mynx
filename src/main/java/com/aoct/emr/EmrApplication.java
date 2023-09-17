package com.aoct.emr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.aoct.emr.communication.config.TwilioConfig;
import com.twilio.Twilio;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@EnableConfigurationProperties
public class EmrApplication {

	@Autowired
	private TwilioConfig twilioConfig;

	public static void main(String[] args) {
		SpringApplication.run(EmrApplication.class, args);
	}

	@PostConstruct
	public void setup() {
		Twilio.init(twilioConfig.getAccountSid(), twilioConfig.getAuthToken());
	}

}
