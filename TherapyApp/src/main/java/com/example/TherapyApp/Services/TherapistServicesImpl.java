package com.example.TherapyApp.Services;

import com.example.TherapyApp.Data.model.Appointment;
import com.example.TherapyApp.Data.model.Specialization;
import com.example.TherapyApp.Data.model.Therapist;
import com.example.TherapyApp.Data.repo.AppointmentRepository;
import com.example.TherapyApp.Data.repo.TherapistRepository;
import com.example.TherapyApp.Exception.AppointmentNotFoundException;
import com.example.TherapyApp.Exception.TherapistAlreadyExist;
import com.example.TherapyApp.Exception.TherapistNotFoundException;
import com.example.TherapyApp.dto.Request.TherapistRegisterRequest;
import com.example.TherapyApp.dto.Request.TherapistUpdateRequest;
import com.example.TherapyApp.dto.Request.TherapistViewAppointmentRequest;
import com.example.TherapyApp.dto.Response.RecommendedTherapistResponse;
import com.example.TherapyApp.dto.Response.TherapistRegisterResponse;
import com.example.TherapyApp.dto.Response.TherapistUpdateResponse;
import com.example.TherapyApp.dto.Response.TherapistViewAppointmentResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Arrays;
import java.util.List;

@Service
@AllArgsConstructor
public class TherapistServicesImpl implements TherapistServices {
    private final TherapistRepository therapistRepository;
    private final AppointmentRepository appointmentRepository;
    private final Therapist therapists;

    @Override
    public TherapistRegisterResponse register(TherapistRegisterRequest therapistRegisterRequest) {
        Therapist therapist = therapistRepository.findTherapistByEmail(therapistRegisterRequest.getEmail()).
                orElseThrow(()-> new TherapistAlreadyExist("Therapist Already Exist"));
        therapist.setFirstname(therapistRegisterRequest.getFirstname());
        therapist.setLastname(therapistRegisterRequest.getLastname());
        therapist.setEmail(therapistRegisterRequest.getEmail());
        therapist.setYearOfExperience(LocalDate.ofYearDay(LocalDate.now().getYear(), YearMonth.now().getMonthValue()));
        therapist.setAddress(therapistRegisterRequest.getAddress());
        therapist.setSpecializations(therapistRegisterRequest.getSpecialization());
        therapist.setPhoneNumber(therapistRegisterRequest.getPhoneNumber());
        Therapist saveTherapist = therapistRepository.save(therapist);
        TherapistRegisterResponse response = new TherapistRegisterResponse();
        response.setMessage("Successfully registered");
        response.setStatus(saveTherapist.getStatus().toString());
        return null;
    }

    @Override
    public TherapistUpdateResponse updateProfile(TherapistUpdateRequest therapistUpdateRequest) {
        Therapist therapist = therapistRepository.findTherapistByEmail(therapistUpdateRequest.getEmail()).
                orElseThrow(()-> new TherapistNotFoundException("Therapist not found"));
        therapist.setFirstname(therapistUpdateRequest.getFirstname());
        therapist.setLastname(therapistUpdateRequest.getLastname());
        therapist.setAddress(therapistUpdateRequest.getAddress());
        therapist.setCity(therapistUpdateRequest.getCity());
        therapist.setState(therapistUpdateRequest.getState());
        therapist.setPhoneNumber(therapistUpdateRequest.getPhone());
        therapist.setEmail(therapistUpdateRequest.getEmail());
        Therapist savedTherapist = therapistRepository.save(therapist);
        TherapistUpdateResponse therapistUpdateResponse = new TherapistUpdateResponse();
        therapistUpdateResponse.setMessage("Successfully updated therapist");
        therapistUpdateResponse.setStatus(therapistUpdateResponse.getStatus());
        return therapistUpdateResponse;
    }

    @Override
    public TherapistViewAppointmentResponse viewAppointment(TherapistViewAppointmentRequest therapistViewAppointmentRequest) {
        Appointment appointment = appointmentRepository.findByAppointmentId(therapistViewAppointmentRequest.getAppointmentId()).
                orElseThrow(()-> new AppointmentNotFoundException("Appointment not found"));
        return null;
    }

//    @Override
//    public List<RecommendedTherapistResponse> getRecommendedTherapists(Long userId) {
//        return List.of();
//    }
}
