package com.example.TherapyApp.Services;

import com.example.TherapyApp.Data.model.Therapist;
import com.example.TherapyApp.Data.model.User;
import com.example.TherapyApp.Data.repo.AdminRepository;
import com.example.TherapyApp.Data.repo.TherapistRepository;
import com.example.TherapyApp.Data.repo.UserRepository;
import com.example.TherapyApp.Exception.UserNotPreferredSpecializationException;
import com.example.TherapyApp.dto.Response.RecommendedTherapistResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AdminServicesImpl implements AdminServices {
    private final AdminRepository adminRepository;
    private final UserRepository userRepository;
    private final User user;
    private final TherapistRepository therapistRepository;

//    @Override
//    public List<RecommendedTherapistResponse> getRecommendedTherapists(Long userId) {
//        User user = userRepository.findById(userId).
//                orElseThrow(()-> new RuntimeException("User Not Found"));
//        String preferredSpecialization = user.getPreferredSpecialization();
//        if (preferredSpecialization == null || preferredSpecialization.isEmpty()) {
//            throw new UserNotPreferredSpecializationException("User does not have a preferred specialization");
//        }
//        List<Therapist> therapists = therapistRepository.findBySpecializationsContaining(preferredSpecialization);
//        return therapists.stream().map(Therapist->{
//            RecommendedTherapistResponse response = new RecommendedTherapistResponse();
//            response.setTherapistId(response.getTherapistId());
//            response.setName(response.getName());
//            response.setSpecializations(response.getSpecializations());
//            response.setAvailability(response.getAvailability());
//            return response;
//        })
//                .collect(Collectors.toList());
//    }
}
