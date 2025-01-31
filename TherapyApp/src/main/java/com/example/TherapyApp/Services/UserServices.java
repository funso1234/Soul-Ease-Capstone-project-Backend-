package com.example.TherapyApp.Services;

import com.example.TherapyApp.dto.Request.*;
import com.example.TherapyApp.dto.Response.*;
import org.springframework.stereotype.Service;


public interface UserServices {
    UserRegistrationResponse register(UserRegistrationRequest userRegistrationRequest);
    UserLoginResponse login(UserLoginRequest userLoginRequest);
    UserEditResponse editProfile(UserEditRequest userEditRequest);
    UserUpdateResponse updateProfile(UserUpdateRequest userUpdateRequest);
    AppointmentResponse bookAppointment(AppointmentRequest request);
}
