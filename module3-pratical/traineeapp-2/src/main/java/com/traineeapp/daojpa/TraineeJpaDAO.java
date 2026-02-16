package com.traineeapp.daojpa;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import com.traineeapp.dao.TraineeDAO;
import com.traineeapp.entity.Trainee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@ConditionalOnProperty(
	    name = "trainee.dao.type",
	    havingValue = "jpa"
	)
@Transactional
public class TraineeJpaDAO implements TraineeDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addTrainee(Trainee trainee) {
        entityManager.persist(trainee);
    }

    
    @Override
    public Trainee findById(int traineeId) {
        Trainee trainee = entityManager.find(Trainee.class, traineeId);
        if (trainee == null) {
            throw new RuntimeException("Trainee not found");
        }
        return trainee;
    }
}
