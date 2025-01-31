package com.example.TherapyApp.Data.repo;

import com.example.TherapyApp.Data.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    Optional<Appointment> findByAppointmentId(Long appointmentId);
//    boolean existsByTherapistId(Long therapistId);
//    boolean existsByAppointmentId(Long appointmentId);

}
