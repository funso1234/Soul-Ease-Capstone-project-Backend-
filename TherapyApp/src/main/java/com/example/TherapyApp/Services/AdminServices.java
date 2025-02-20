package com.example.TherapyApp.Services;

import com.example.TherapyApp.dto.Response.RecommendedTherapistResponse;

import java.util.List;

public interface AdminServices {
    List<RecommendedTherapistResponse> getRecommendedTherapists(Long userId);
}
