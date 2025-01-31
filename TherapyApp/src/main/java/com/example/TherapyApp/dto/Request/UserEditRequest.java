package com.example.TherapyApp.dto.Request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserEditRequest {
    @NotBlank(message = "Firstname is required")
    private String firstName;
    @NotBlank(message = "Lastname is required")
    private String lastName;
    @NotBlank(message = "Email is required")
    @Email(message = "Email details must be a valid email")
    private String email;
    @NotBlank(message = "Password is required")
    private String password;
    @NotBlank(message = "PhoneNumber is required")
    private String phoneNumber;
}
