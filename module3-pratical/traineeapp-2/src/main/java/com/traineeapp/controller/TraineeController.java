package com.traineeapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.traineeapp.entity.Trainee;
import com.traineeapp.service.TraineeService;

@RestController
@RequestMapping("/trainees")
public class TraineeController {

    private final TraineeService traineeService;

    public TraineeController(TraineeService traineeService) {
        this.traineeService = traineeService;
    }

    @PostMapping
    public ResponseEntity<String> addTrainee(@RequestBody Trainee trainee) {
        traineeService.addTrainee(trainee);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Trainee added successfully");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Trainee> getTraineeById(@PathVariable int id) {
        Trainee trainee = traineeService.getTraineeById(id);
        return ResponseEntity.ok(trainee);
    }
}

