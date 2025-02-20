package com.example.TherapyApp.Data.repo;

import com.example.TherapyApp.Data.model.Specialization;
import com.example.TherapyApp.Data.model.Therapist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TherapistRepository extends JpaRepository<Therapist, Long> {
    Optional<Therapist> findTherapistByEmail(String email);
    List<Therapist> findBySpecializations(Specialization specialization);
}
