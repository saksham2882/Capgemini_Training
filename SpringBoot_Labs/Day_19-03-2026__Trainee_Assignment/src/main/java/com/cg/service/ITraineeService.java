package com.cg.service;

import com.cg.dto.TraineeDTO;

import java.util.List;

public interface ITraineeService {

    public TraineeDTO addTrainee(TraineeDTO trainee);
    public TraineeDTO updateTrainee(int id, TraineeDTO trainee);
    public List<TraineeDTO> getAllTrainee();
    public TraineeDTO getTraineeById(int id);
    public String removeTrainee(int id);
    public List<TraineeDTO> getTraineeByName(String name);
    public List<TraineeDTO> getTraineeByLocation(String location);
    public List<TraineeDTO> getTraineeByDomain(String domain);
}
