package com.example.TherapyApp.Data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Setter
@Getter
@Entity
@Component
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String preferredSpecialization;
    @Enumerated(EnumType.STRING)
    private Role role;
    @OneToMany
    private List<Appointment> appointments;
    @OneToMany
    private List<Booking> bookings;
}
