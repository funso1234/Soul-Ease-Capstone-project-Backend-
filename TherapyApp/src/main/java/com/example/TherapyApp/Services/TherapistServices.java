package com.example.TherapyApp.Services;

import com.example.TherapyApp.dto.Request.TherapistRegisterRequest;
import com.example.TherapyApp.dto.Request.TherapistUpdateRequest;
import com.example.TherapyApp.dto.Request.TherapistViewAppointmentRequest;
import com.example.TherapyApp.dto.Response.RecommendedTherapistResponse;
import com.example.TherapyApp.dto.Response.TherapistRegisterResponse;
import com.example.TherapyApp.dto.Response.TherapistUpdateResponse;
import com.example.TherapyApp.dto.Response.TherapistViewAppointmentResponse;

import java.util.List;

public interface TherapistServices {
    TherapistRegisterResponse register(TherapistRegisterRequest therapistRegisterRequest);
    TherapistUpdateResponse updateProfile(TherapistUpdateRequest therapistUpdateRequest);
    TherapistViewAppointmentResponse viewAppointment(TherapistViewAppointmentRequest therapistViewAppointmentRequest);

    List<RecommendedTherapistResponse> getRecommendedTherapists(Long userId);

//    List<RecommendedTherapistResponse> getRecommendedTherapists(Long userId);
}
