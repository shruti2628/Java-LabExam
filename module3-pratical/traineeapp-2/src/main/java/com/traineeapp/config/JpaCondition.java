package com.traineeapp.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class JpaCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context,
                           AnnotatedTypeMetadata metadata) {

        String type = context.getEnvironment()
                             .getProperty("app.persistence.type");

        return "jpa".equalsIgnoreCase(type);
    }
}
