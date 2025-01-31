package com.example.TherapyApp.dto.Response;

import com.example.TherapyApp.Data.model.Status;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TherapistViewAppointmentResponse {
    private String message;
    private Status status;
}
