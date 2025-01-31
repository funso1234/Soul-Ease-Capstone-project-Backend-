package com.example.TherapyApp.Data.repo;

import com.example.TherapyApp.Data.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
