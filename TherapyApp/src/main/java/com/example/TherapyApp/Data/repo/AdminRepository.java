package com.example.TherapyApp.Data.repo;

import com.example.TherapyApp.Data.model.Admin;
import com.example.TherapyApp.Data.model.Therapist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface AdminRepository extends JpaRepository<Admin, Long> {
}
