package com.example.TherapyApp.dto.Request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TherapistUpdateRequest {
    private Long therapistId;
    private String firstname;
    private String lastname;
    private String address;
    private String city;
    private String state;
    private String specialization;
    private String phone;
    private String email;

}
