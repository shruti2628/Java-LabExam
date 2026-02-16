package com.traineeapp.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class JdbcCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context,
                           AnnotatedTypeMetadata metadata) {

        String type = context.getEnvironment()
                             .getProperty("app.persistence.type");

        return "jdbc".equalsIgnoreCase(type);
    }
    //System.out.println("DAO TYPE = " +context.getEnvironment().getProperty("trainee.dao.type"));

}
