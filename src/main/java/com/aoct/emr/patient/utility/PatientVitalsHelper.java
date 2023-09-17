package com.aoct.emr.patient.utility;

import com.aoct.emr.patient.entity.PatientVitals;
import com.aoct.emr.patient.uiRequest.PatientVitalsUiRequest;
import com.aoct.emr.patient.uiResponse.PatientVitalsUiResponse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PatientVitalsHelper {
    public static PatientVitals convertPatientVitalsUiRequest(PatientVitalsUiRequest request){
        PatientVitals v =new PatientVitals();
        v.setPatientId(request.getPatientId());
        v.setHeight(request.getHeight());
        v.setWeight(request.getWeight());
        v.setBloodPressure(request.getBloodPressure());
        v.setAssessmentDate(request.getAssessmentDate());
        v.setTemperature(request.getTemperature());
        v.setO2Saturation(request.getO2Saturation());
        v.setRespirationRate(request.getRespirationRate());
        v.setPulseRate(request.getPulseRate());
        v.setBmi(request.getBmi());
        return v;
    }

    public static PatientVitalsUiResponse convertPatientVitalsUiResponse(PatientVitals v){
        PatientVitalsUiResponse response=new PatientVitalsUiResponse();

        response.setHeight(v.getHeight());
        response.setWeight(v.getWeight());
        response.setBloodPressure(v.getBloodPressure());
        response.setTemperature(v.getTemperature());
        response.setPulseRate(v.getPulseRate());
        response.setO2Saturation(v.getO2Saturation());
        response.setRespirationRate(v.getRespirationRate());

        // String bmi=bmiCalculator(v.getHeight(),v.getWeight());

        response.setBmi(v.getBmi());

        return response;
    }

    public static Map<LocalDate,PatientVitalsUiResponse> convertPatientVitalsListUiResponse(List<PatientVitals> vitalslist) {

        List<PatientVitalsUiResponse> listOfVitals=new ArrayList<>();
        Map<LocalDate,PatientVitalsUiResponse> map=new HashMap<>();
        for(PatientVitals v:vitalslist){
            map.put(v.getAssessmentDate(),convertPatientVitalsUiResponse(v));

        }
        return map;
    }

    public static String bmiCalculator(String height,String weight){
        try {

            double heightInInches;
            double weightInPounds;

            String[] heightParts = height.split(" ");
            String[] weightParts = weight.split(" ");

            if (heightParts.length != 2 || weightParts.length != 2) {
                return "Invalid input";
            }

            if (heightParts[1].equalsIgnoreCase("in")) {
                heightInInches = Double.parseDouble(heightParts[0]);
            } else if (heightParts[1].equalsIgnoreCase("ft")) {
                heightInInches = Double.parseDouble(heightParts[0]) * 12;
            } else {
                return "Invalid height unit";
            }

            if (weightParts[1].equalsIgnoreCase("lbs")) {
                weightInPounds = Double.parseDouble(weightParts[0]);
            } else {
                return "Invalid weight unit";
            }

            double bmi = (weightInPounds * 703) / (heightInInches * heightInInches);

            return String.format("%.2f", bmi);
        } catch (NumberFormatException e) {
            return "Invalid input";
        }

    }
}
