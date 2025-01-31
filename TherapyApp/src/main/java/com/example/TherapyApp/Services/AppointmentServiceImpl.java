package com.example.TherapyApp.Services;

import com.example.TherapyApp.Data.model.Appointment;
import com.example.TherapyApp.Data.repo.AppointmentRepository;
import com.example.TherapyApp.dto.Request.UserBookAppointmentRequest;
import com.example.TherapyApp.dto.Response.UserBookAppointmentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final Appointment appointment;

    @Override
    public UserBookAppointmentResponse bookAppointment(UserBookAppointmentRequest bookAppointmentRequest) {
        Appointment appointmentRequest = new Appointment();
        appointmentRequest.setRequestedRenderedService(bookAppointmentRequest.getRenderedServiceType());
        appointmentRequest.setNotes(bookAppointmentRequest.getNote());
        appointmentRepository.save(appointmentRequest);
        UserBookAppointmentResponse response = new UserBookAppointmentResponse();
        response.setMessage("Appointment Booked Successfully");
        return response;
    }
}
