package com.cg.controller;


import com.cg.dto.TraineeDTO;
import com.cg.service.TraineeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("trainee")
public class TraineeController {

    private TraineeService service;

    public TraineeController(TraineeService service) {
        this.service = service;
    }


    @PostMapping
    public TraineeDTO createTrainee(@RequestBody TraineeDTO t){
        return service.addTrainee(t);
    }


    @GetMapping
    public List<TraineeDTO> getAllTrainees(){
        return service.getAllTrainee();
    }


    @GetMapping("/{id}")
    public TraineeDTO getById(@PathVariable int id){
        return service.getTraineeById(id);
    }


    @GetMapping("/name/{n}")
    public List<TraineeDTO> getByName(@PathVariable("n") String name){
        return service.getTraineeByName(name);
    }


    @GetMapping("/location/{l}")
    public List<TraineeDTO> getByLocation(@PathVariable("l") String location){
        return service.getTraineeByLocation(location);
    }


    @GetMapping("/domain/{d}")
    public List<TraineeDTO> getByDomain(@PathVariable("d") String domain){
        return service.getTraineeByDomain(domain);
    }


    @DeleteMapping("/delete/{id}")
    public String deleteTrainee(@PathVariable int id){
        return service.removeTrainee(id);
    }


    @PutMapping("/update/{id}")
    public TraineeDTO updateTrainee(@PathVariable int id, @RequestBody TraineeDTO t){
        return service.updateTrainee(id, t);
    }
}
