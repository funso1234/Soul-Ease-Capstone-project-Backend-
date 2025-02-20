package com.example.TherapyApp.Controller;

import com.example.TherapyApp.Data.repo.UserRepository;
import com.example.TherapyApp.Services.UserServices;
import com.example.TherapyApp.dto.Request.*;
import com.example.TherapyApp.dto.Response.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@RequestMapping("/api/user")
@RestController
@CrossOrigin(origins = "*")
public class UserController {
    private final UserServices userServices;

    @PostMapping("/register-user")
    public ResponseEntity<?> register(@RequestBody UserRegistrationRequest request){
        try {
            UserRegistrationResponse userRegistrationResponse = userServices.register(request);
            return ResponseEntity.ok(userRegistrationResponse);
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/login-user")
    public ResponseEntity<?> login(@RequestBody UserLoginRequest request){
        try {
            UserLoginResponse userLoginResponse = userServices.login(request);
            return ResponseEntity.ok(userLoginResponse);
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @GetMapping("/edit_profile")
    public ResponseEntity<?> editProfile(@RequestBody UserEditRequest userEditRequest){
        try {
            UserEditResponse userEditResponse = userServices.editProfile(userEditRequest);
            return ResponseEntity.ok(userEditResponse);
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @GetMapping("/update-user")
    public ResponseEntity<?> updateProfile(@RequestBody UserUpdateRequest userUpdateRequest){
        try {
            UserUpdateResponse updateResponse = userServices.updateProfile(userUpdateRequest);
            return ResponseEntity.ok(updateResponse);
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @GetMapping("/book-appointment")
    public ResponseEntity<?> bookAppointment(@RequestBody AppointmentRequest appointmentRequest){
        try {
            AppointmentResponse appointmentResponse = userServices.bookAppointment(appointmentRequest);
            return ResponseEntity.ok(appointmentResponse);
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
