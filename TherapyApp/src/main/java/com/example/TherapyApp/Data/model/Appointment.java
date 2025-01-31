package com.example.TherapyApp.Data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Component
@Table(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointmentId;
    private Long userId;
//    private Long therapistId;
    private LocalDateTime timeBooked = LocalDateTime.now();
    @Enumerated(EnumType.STRING)
    private RenderedService requestedRenderedService;
    private String notes;
    @Enumerated(EnumType.STRING)
    private Status status;

}
