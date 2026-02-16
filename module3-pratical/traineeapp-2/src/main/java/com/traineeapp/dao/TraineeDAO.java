package com.traineeapp.dao;

import com.traineeapp.entity.Trainee;

public interface TraineeDAO {

    void addTrainee(Trainee trainee);

    Trainee findById(int traineeId);
}
