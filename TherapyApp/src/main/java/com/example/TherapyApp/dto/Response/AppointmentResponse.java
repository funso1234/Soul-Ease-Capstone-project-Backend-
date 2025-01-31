package com.example.TherapyApp.dto.Response;

import com.example.TherapyApp.Data.model.Status;
import com.example.TherapyApp.Data.model.Therapist;
import com.example.TherapyApp.Data.model.User;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Setter
@Getter
public class AppointmentResponse {
    private String message;
    private String status;
//    private Long appointmentId;
//    private Long userId;
//    private Long therapistId;
//    private LocalDateTime appointmentTime;
//    private String notes;
//    @ManyToOne
//    private User user;
//    @ManyToOne
//    private Therapist therapist;
}
