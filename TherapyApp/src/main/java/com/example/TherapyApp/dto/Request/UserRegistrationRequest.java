package com.example.TherapyApp.dto.Request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserRegistrationRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
