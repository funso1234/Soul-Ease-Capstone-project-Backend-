package com.example.TherapyApp.dto.Response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class RecommendedTherapistResponse {
    private Long therapistId;
    private String name;
    private List<String> specializations;
    private String availability;
}
