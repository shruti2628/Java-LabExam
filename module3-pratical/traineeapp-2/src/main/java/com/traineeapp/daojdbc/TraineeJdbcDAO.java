package com.traineeapp.daojdbc;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.traineeapp.dao.TraineeDAO;
import com.traineeapp.entity.Trainee;

@Repository
@ConditionalOnProperty(
	    name = "trainee.dao.type",
	    havingValue = "jdbc"
	)
public class TraineeJdbcDAO implements TraineeDAO {

    private final JdbcTemplate jdbcTemplate;

    public TraineeJdbcDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addTrainee(Trainee trainee) {

        String sql = "INSERT INTO trainee (name, branch, percentage) VALUES (?, ?, ?)";

        jdbcTemplate.update(
            sql,
            trainee.getName(),
            trainee.getBranch(),
            trainee.getPercentage()
        );
    }

    @Override
    public Trainee findById(int traineeId) {

        String sql = "SELECT * FROM trainee WHERE trainee_id = ?";

        return jdbcTemplate.queryForObject(
            sql,
            (rs, rowNum) -> new Trainee(
                rs.getInt("trainee_id"),
                rs.getString("name"),
                rs.getString("branch"),
                rs.getDouble("percentage")
            ),
            traineeId
        );
    }
}
