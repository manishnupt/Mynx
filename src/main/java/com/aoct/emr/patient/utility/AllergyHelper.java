package com.aoct.emr.patient.utility;

import com.aoct.emr.patient.entity.Allergy;
import com.aoct.emr.patient.uiRequest.AllergyUiRequest;
import com.aoct.emr.patient.uiResponse.AllergyUiResponse;

import java.util.ArrayList;
import java.util.List;

public class AllergyHelper {

    public static Allergy convertAllergyUiRequest(AllergyUiRequest request){
        Allergy a=new Allergy();

        a.setPatientId(request.getPatientId());
        a.setOnset(request.getOnset());
        a.setReaction(request.getReaction());
        a.setSeverity(request.getSeverity());
        a.setActiveAllergy(true);
        a.setAllergyId(request.getAllergyId());
        a.setDrugAllergyFlag(request.isDrugAllergyFlag());
        a.setSearchAllergy(request.getSearchAllergy());
        return a;
    }

    public static AllergyUiResponse convertAllergyUiResponse(Allergy allergy){
        AllergyUiResponse response=new AllergyUiResponse();
        response.setAllergyId(allergy.getAllergyId());
        response.setOnset(allergy.getOnset());
        response.setSeverity(allergy.getSeverity());
        response.setReaction(allergy.getReaction());
        response.setPatientId(allergy.getPatientId());
        response.setActiveAllergy(allergy.isActiveAllergy());
        response.setPatientAllergyId(allergy.getPatientAllergyId());
        response.setDrugAllergyFlag(allergy.isDrugAllergyFlag());
        response.setSearchAllergy(allergy.getSearchAllergy());
        return response;
    }

    public static List<AllergyUiResponse> convertAllergyListUiResponse(List<Allergy> allergyList) {
        List<AllergyUiResponse> listOfAllergy=new ArrayList<>();
        for(Allergy a:allergyList){
            AllergyUiResponse allergyUiResponse=convertAllergyUiResponse(a);
            listOfAllergy.add(allergyUiResponse);
        }
        return listOfAllergy;
    }
}
