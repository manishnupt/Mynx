package com.aoct.emr.communication.uiRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OtpUiRequest {
	private String username;
    private String phoneNumber;
	

}
