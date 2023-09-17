package com.aoct.emr.provider.uiResponse;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

import lombok.Data;

@Data
public class ProviderWorkingScheduleResponse {
    private Long scheduleId;
    private String title;
    private LocalDate workingDay;
    private String startTime;
    private String endTime;
    private String lunchStartTime;
    private String lunchEndTime;
    private boolean approvalFlag;
    private String reasonForLeave;
    private String scheduleType;

    private String leaveStartTime;
    private String leaveEndTime;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<String> listOfDays;;
}

