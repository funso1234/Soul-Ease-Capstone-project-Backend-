package com.example.TherapyApp.Exception;

public class TherapistNotFoundException extends RuntimeException{
    public TherapistNotFoundException(String message) {
        super(message);
    }
}
