package com.example.TherapyApp.dto.Request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class TherapistViewAppointmentRequest {
    private Long therapistId;
    private Long appointmentId;
    private LocalDateTime appointmentTime = LocalDateTime.now();
}
