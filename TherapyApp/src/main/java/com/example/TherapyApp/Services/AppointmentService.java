package com.example.TherapyApp.Services;

import com.example.TherapyApp.dto.Request.UserBookAppointmentRequest;
import com.example.TherapyApp.dto.Response.UserBookAppointmentResponse;

public interface AppointmentService {

    UserBookAppointmentResponse bookAppointment(UserBookAppointmentRequest bookAppointmentRequest);

}
