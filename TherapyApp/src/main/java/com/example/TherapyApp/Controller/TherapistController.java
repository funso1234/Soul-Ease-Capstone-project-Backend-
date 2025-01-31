package com.example.TherapyApp.Controller;

import com.example.TherapyApp.Services.TherapistServices;
import com.example.TherapyApp.dto.Request.TherapistRegisterRequest;
import com.example.TherapyApp.dto.Request.TherapistUpdateRequest;
import com.example.TherapyApp.dto.Response.TherapistRegisterResponse;
import com.example.TherapyApp.dto.Response.TherapistUpdateResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/therapist")
public class TherapistController {
    private final TherapistServices therapistServices;

    @PostMapping("/register-therapist")
    public ResponseEntity<?> register(@RequestBody TherapistRegisterRequest therapistRegisterRequest) {
        try {
            TherapistRegisterResponse response = therapistServices.register(therapistRegisterRequest);
            return ResponseEntity.ok(response);
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/update-therpist")
    public ResponseEntity<?> update(@RequestBody TherapistUpdateRequest therapistUpdateRequest) {
        try {
            TherapistUpdateResponse updateResponse = therapistServices.updateProfile(therapistUpdateRequest);
            return ResponseEntity.ok(updateResponse);
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
