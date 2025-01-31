package com.example.TherapyApp.dto.Request;

import com.example.TherapyApp.Data.model.Specialization;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class TherapistRegisterRequest {
    private String firstname;
    private String lastname;
    private Specialization specialization;
    private LocalDate yearOfExperience;
    private String address;
    private String phoneNumber;
    private String email;
    private String password;

}

