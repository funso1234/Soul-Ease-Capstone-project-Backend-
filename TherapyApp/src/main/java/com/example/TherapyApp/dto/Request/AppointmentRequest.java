package com.example.TherapyApp.dto.Request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AppointmentRequest {

    private Long userId;
//    private Long therapistId;
    private String requestedService;
    private String notes;
    private String status;
}
