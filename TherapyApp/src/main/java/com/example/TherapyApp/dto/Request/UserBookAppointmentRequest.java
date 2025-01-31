package com.example.TherapyApp.dto.Request;

import com.example.TherapyApp.Data.model.RenderedService;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class UserBookAppointmentRequest {
    private Long customerId;
    @NotBlank(message = "Date is required")
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Date must be in YYYY-MM-DD format")
    private LocalDateTime date;
    @NotBlank(message = "service type is required")
    private RenderedService renderedServiceType;
    @NotBlank(message = "note is required")
    private String note;

}
