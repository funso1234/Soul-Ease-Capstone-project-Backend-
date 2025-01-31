package com.example.TherapyApp.Controller;

import com.example.TherapyApp.Services.AdminServices;
import com.example.TherapyApp.Services.TherapistServices;
import com.example.TherapyApp.dto.Response.RecommendedTherapistResponse;
import lombok.AllArgsConstructor;
import org.apache.catalina.connector.Request;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/admin")
public class AminController {
//    private final AdminServices adminServices;
//    private final TherapistServices therapistServices;
//
//    @GetMapping("/recommended/therapist{userId}")
//    public ResponseEntity<List<RecommendedTherapistResponse>> getRecommendedTherapists(@PathVariable Long userId) {
//        List<RecommendedTherapistResponse> recommendedTherapists = therapistServices.getRecommendedTherapists(userId);
//        return new ResponseEntity<>(recommendedTherapists, HttpStatus.OK);
//    }
}
