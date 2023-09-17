package com.aoct.emr.communication.response;

import com.aoct.emr.communication.utility.OtpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OtpUiResponse {
	private OtpStatus status;
    private String message;

}
