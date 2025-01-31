package com.example.TherapyApp;

import com.example.TherapyApp.Services.AppointmentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

@SpringBootTest
public class AppointmentRenderedServiceTest {

    @Autowired
    public AppointmentService appointmentService;


    @Test
    public void testThatCanBookAnAppointment() {
//        UserBookAppointmentRequest bookAppointmentRequest = new UserBookAppointmentRequest();
//        bookAppointmentRequest.setFirstname("Sam");
//        bookAppointmentRequest.setLastname("Kamal");
//        bookAppointmentRequest.setServiceType(Service.Financial);
//        bookAppointmentRequest.setNote("My Sapa is real");
//        bookAppointmentRequest.setAppointmentDate(LocalDate.from(LocalDateTime.now()));
//        UserBookAppointmentResponse bookAppointmentResponse = appointmentService.bookAppointment(bookAppointmentRequest);
//        assertThat(bookAppointmentResponse.getMessage()).contains("Booked successfully");
//    }
    }
}
