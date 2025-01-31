package com.example.TherapyApp.Data.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@Entity
@Component
@Table(name = "therapists")
public class Therapist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long therapistId;
    @Column(nullable = false)
    @NotBlank(message = "Firstname is required")
    private String firstname;
    @Column(nullable = false)
    @NotBlank(message = "Lastname is required")
    private String lastname;
    @Column(nullable = false)
    @NotBlank(message = "Address is required")
    private String address;
    @Column(nullable = false)
    @NotBlank(message = "City is required")
    private String city;
    @Column(nullable = false)
    @NotBlank(message = "State is required")
    private String state;
    @Column(nullable = false)
    @NotBlank(message = "Country is required")
    private String country;
    @Column(nullable = false)
    @NotBlank(message = "Status is required")
    private Status status;
    @Column(nullable = false)
    @NotBlank(message = "PhoneNumber is required")
    private String phoneNumber;
    @Column(nullable = false)
    @NotBlank(message = "Email is required")
    @Email(message = "Email must be a valid email")
    private String email;
    @Column(nullable = false)
    @NotBlank(message = "Specialization is required")
    private Specialization specializations;
    @Column(nullable = false)
    @NotBlank(message = "Year is required")
    private LocalDate yearOfExperience;
    @OneToMany
    private List<Appointment> appointments;
    @OneToMany
    private List<User> users;

}
