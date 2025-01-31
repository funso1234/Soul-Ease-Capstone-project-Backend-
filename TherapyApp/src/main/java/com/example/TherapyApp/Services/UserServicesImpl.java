package com.example.TherapyApp.Services;

import com.example.TherapyApp.Data.model.*;
import com.example.TherapyApp.Data.repo.AppointmentRepository;
import com.example.TherapyApp.Data.repo.TherapistRepository;
import com.example.TherapyApp.Data.repo.UserRepository;
import com.example.TherapyApp.Exception.TherapistNotAvailableException;
import com.example.TherapyApp.Exception.TherapistNotFoundException;
import com.example.TherapyApp.Exception.UserNotFoundException;
import com.example.TherapyApp.dto.Request.*;
import com.example.TherapyApp.dto.Response.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserServicesImpl implements UserServices{
    private final UserRepository userRepository;
    private final User users;
    private final AppointmentRepository appointmentRepository;
    private final TherapistRepository therapistRepository;
    private final Appointment appointments;

    @Override
    public UserRegistrationResponse register(UserRegistrationRequest userRegistrationRequest) {
        User user = new User();
        user.setFirstName(userRegistrationRequest.getFirstName());
        user.setLastName(userRegistrationRequest.getLastName());
        user.setEmail(userRegistrationRequest.getEmail());
        user.setPassword(userRegistrationRequest.getPassword());
        User users = userRepository.save(user);
        UserRegistrationResponse userRegistrationResponse = new UserRegistrationResponse();
        userRegistrationResponse.setMessage("Registration Successful");
        return userRegistrationResponse;
    }

    @Override
    public UserLoginResponse login(UserLoginRequest userLoginRequest) {
        User user = userRepository.findByEmail(userLoginRequest.getEmail()).
                orElseThrow(()-> new UserNotFoundException("User not found"));
        user.setEmail(userLoginRequest.getEmail());
        user.setPassword(userLoginRequest.getPassword());
        UserLoginResponse userLoginResponse = new UserLoginResponse();
        userLoginResponse.setMessage("Login Successful");
        return userLoginResponse;
    }

    @Override
    public UserEditResponse editProfile(UserEditRequest userEditRequest) {
        User editRequest = userRepository.findByEmail(userEditRequest.getEmail()).
                orElseThrow(()-> new UserNotFoundException("User not found"));
        editRequest.setFirstName(userEditRequest.getFirstName());
        editRequest.setLastName(userEditRequest.getLastName());
        editRequest.setEmail(userEditRequest.getEmail());
        editRequest.setPassword(userEditRequest.getPassword());
        UserEditResponse userEditResponse = new UserEditResponse();
        userEditResponse.setMessage("Profile updated successfully");
        return userEditResponse;
    }

    @Override
    public UserUpdateResponse updateProfile(UserUpdateRequest userUpdateRequest) {
        User user = userRepository.findByEmail(userUpdateRequest.getEmail()).
                orElseThrow(()-> new UserNotFoundException("User not found"));
        user.setFirstName(userUpdateRequest.getFirstName());
        user.setLastName(userUpdateRequest.getLastName());
        user.setEmail(userUpdateRequest.getEmail());
        user.setPassword(userUpdateRequest.getPassword());
        UserUpdateResponse userUpdateResponse = new UserUpdateResponse();
        userUpdateResponse.setMessage("Profile updated successfully");
        return userUpdateResponse;
    }


    @Override
    public AppointmentResponse bookAppointment(AppointmentRequest request) {
        User user = userRepository.findById(request.getUserId())
                .orElseThrow(() -> new UserNotFoundException("User not found"));

//        Therapist therapist = therapistRepository.findById(request.getTherapistId())
//                .orElseThrow(() -> new TherapistNotFoundException("Therapist not found"));
//
//        if (appointmentRepository.existsByTherapistId( request.getTherapistId())) {
//            throw new TherapistNotAvailableException("The therapist is not available at the selected time");
//        }


        Appointment appointment = new Appointment();
        appointment.setUserId(user.getUserId());
        appointment.setRequestedRenderedService(RenderedService.valueOf(request.getRequestedService()));
        appointment.setStatus(Status.valueOf(request.getStatus()));
        appointment.setNotes(request.getNotes());
        Appointment saveAppointment = appointmentRepository.save(appointment);
        AppointmentResponse appointmentResponse = new AppointmentResponse();
        appointmentResponse.setMessage("Booking Successful");
        appointmentResponse.setStatus(saveAppointment.getStatus().toString());
        return appointmentResponse;
    }

}

