package com.example.TherapyApp.dto.Request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserUpdateRequest {
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;
}
