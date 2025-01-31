package com.example.TherapyApp.Data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "admins")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminId;
    @OneToMany
    private List<Therapist> therapistList;
    @OneToMany
    private List<User> userList;
    @OneToMany
    private List<Appointment> appointmentList;
}
