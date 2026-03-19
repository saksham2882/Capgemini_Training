package com.cg.dto;

import com.cg.entity.Trainee;

public class EntityMapper {

    public static TraineeDTO convertToDTO(Trainee t) {
        return new TraineeDTO(t.getTraineeName(), t.getTraineeDomain(), t.getTraineeLocation());
    }

    public static Trainee convertToEntity(TraineeDTO t) {
        return new Trainee(t.getName(), t.getDomain(), t.getLocation());
    }
}
