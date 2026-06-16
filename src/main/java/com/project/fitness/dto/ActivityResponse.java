package com.project.fitness.dto;

import com.project.fitness.model.ActivityType;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActivityResponse {
    private String id;
    private String userId;
    private ActivityType type;
    private Map<String, Object> additionalMatrices;
    private Integer duration;
    private Integer caloriesBurned;
    private LocalDateTime startTime;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

//    @OneToMany(mappedBy = "activity", cascade = CascadeType.ALL, orphanRemoval = true)
//    @JsonIgnore
//    private List<Recommendation> recommendations = new ArrayList<>();

}
