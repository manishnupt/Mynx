package com.aoct.emr.provider.utility;

import java.util.ArrayList;
import java.util.List;

import com.aoct.emr.provider.entity.ProviderWorkingScheduleEntity;
import com.aoct.emr.provider.uiRequest.ProviderWorkingScheduleRequest;
import com.aoct.emr.provider.uiResponse.ProviderWorkingScheduleResponse;

public class ProviderWorkingScheduleHelper {

    public static ProviderWorkingScheduleEntity convertFromWorkingScheduleRequest(ProviderWorkingScheduleRequest scheduleRequest) {
        ProviderWorkingScheduleEntity scheduleEntity = new ProviderWorkingScheduleEntity();
        scheduleEntity.setTitle(scheduleRequest.getTitle());
        scheduleEntity.setFacility(scheduleRequest.getFacility());
        scheduleEntity.setWorkingDays(scheduleRequest.getWorkingDays());
        scheduleEntity.setStartTime(scheduleRequest.getStartTime());
        scheduleEntity.setEndTime(scheduleRequest.getEndTime());
        scheduleEntity.setLunchStartTime(scheduleRequest.getLunchStartTime());
        scheduleEntity.setLunchEndTime(scheduleRequest.getLunchEndTime());
        scheduleEntity.setApprovalFlag(scheduleRequest.isApprovalFlag());
        scheduleEntity.setReasonForLeave(scheduleRequest.getReasonForLeave());
        scheduleEntity.setScheduleType(scheduleRequest.getScheduleType());

        return scheduleEntity;
    }
   
    public static ProviderWorkingScheduleResponse convertToWorkingScheduleResponse(ProviderWorkingScheduleEntity scheduleEntity) {
        ProviderWorkingScheduleResponse scheduleResponse = new ProviderWorkingScheduleResponse();
        scheduleResponse.setStartTime(scheduleEntity.getStartTime());
        scheduleResponse.setEndTime(scheduleEntity.getEndTime());
        scheduleResponse.setLunchStartTime(scheduleEntity.getLunchStartTime());
        scheduleResponse.setLunchEndTime(scheduleEntity.getLunchEndTime());
        scheduleResponse.setApprovalFlag(scheduleEntity.isApprovalFlag());
        scheduleResponse.setReasonForLeave(scheduleEntity.getReasonForLeave());
        scheduleResponse.setScheduleType(scheduleEntity.getScheduleType());
        return scheduleResponse;
    }

}
