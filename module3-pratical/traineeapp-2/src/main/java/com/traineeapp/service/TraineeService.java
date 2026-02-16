package com.traineeapp.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.traineeapp.dao.TraineeDAO;
import com.traineeapp.entity.Trainee;

@Service
public class TraineeService {

    private final TraineeDAO traineeDAO;

    public TraineeService(TraineeDAO traineeDAO) {
        this.traineeDAO = traineeDAO;
    }

    public void addTrainee(Trainee trainee) {

        if (trainee == null) {
            throw new IllegalArgumentException("Trainee cannot be null");
        }

        if (trainee.getName() == null || trainee.getName().isBlank()) {
            throw new IllegalArgumentException("Trainee name is required");
        }

        traineeDAO.addTrainee(trainee);
    }
    
    
    public Trainee getTraineeById(int id) {

        if (id <= 0) {
            throw new IllegalArgumentException("Invalid trainee ID");
        }

        return traineeDAO.findById(id);
    }
}
