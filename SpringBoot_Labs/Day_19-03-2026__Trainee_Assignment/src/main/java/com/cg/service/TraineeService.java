package com.cg.service;


import com.cg.dao.TraineeRepository;
import com.cg.dto.EntityMapper;
import com.cg.dto.TraineeDTO;
import com.cg.entity.Trainee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TraineeService implements ITraineeService {

    TraineeRepository repo;

    public TraineeService(TraineeRepository repo) {
        this.repo = repo;
    }


    @Override
    public TraineeDTO addTrainee(TraineeDTO trainee) {
        Trainee t = repo.saveAndFlush(EntityMapper.convertToEntity(trainee));
        return EntityMapper.convertToDTO(t);
    }


    @Override
    public TraineeDTO updateTrainee(int id, TraineeDTO t) {
        Trainee trainee = repo.findById(id).orElse(null);
        if (t.getName() != null) {
            trainee.setTraineeName(t.getName());
        }
        if (t.getDomain() != null) {
            trainee.setTraineeDomain(t.getDomain());
        }
        if (t.getLocation() != null) {
            trainee.setTraineeLocation(t.getLocation());
        }
        repo.saveAndFlush(trainee);
        TraineeDTO dto = EntityMapper.convertToDTO(trainee);
        dto.setId(id);
        return dto;
    }


    @Override
    public List<TraineeDTO> getAllTrainee() {
        List<Trainee> list = repo.findAll();
        List<TraineeDTO> dtos = new ArrayList<>();

        list.forEach(t -> {
            TraineeDTO dto = EntityMapper.convertToDTO(t);
            dto.setId(t.getTraineeId());
            dtos.add(dto);
        });
        return dtos;
    }


    @Override
    public TraineeDTO getTraineeById(int id) {
        Optional<Trainee> trainee = repo.findById(id);
        if (trainee.isPresent()) {
            Trainee t = trainee.get();
            TraineeDTO dto = EntityMapper.convertToDTO(t);
            dto.setId(t.getTraineeId());
            return dto;
        }
        return null;
    }


    @Override
    public String removeTrainee(int id) {
        if (getTraineeById(id) == null) {
            return "Trainee not found";
        }
        repo.deleteById(id);
        return "Trainee removed";
    }


    @Override
    public List<TraineeDTO> getTraineeByName(String name) {
        List<Trainee> list = repo.findByTraineeName(name);
        List<TraineeDTO> dtos = new ArrayList<>();

        list.forEach(t -> {
            TraineeDTO dto = EntityMapper.convertToDTO(t);
            dto.setId(t.getTraineeId());
            dtos.add(dto);
        });

        return dtos;
    }


    @Override
    public List<TraineeDTO> getTraineeByLocation(String location) {
        List<Trainee> list = repo.findByTraineeLocation(location);
        List<TraineeDTO> dtos = new ArrayList<>();

        list.forEach(t -> {
            TraineeDTO dto = EntityMapper.convertToDTO(t);
            dto.setId(t.getTraineeId());
            dtos.add(dto);
        });

        return dtos;
    }


    @Override
    public List<TraineeDTO> getTraineeByDomain(String domain) {
        List<Trainee> list = repo.findByTraineeDomain(domain);
        List<TraineeDTO> dtos = new ArrayList<>();

        list.forEach(t -> {
            TraineeDTO dto = EntityMapper.convertToDTO(t);
            dto.setId(t.getTraineeId());
            dtos.add(dto);
        });

        return dtos;
    }
}
