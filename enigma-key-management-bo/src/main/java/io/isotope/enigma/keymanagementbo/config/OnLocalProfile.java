package io.isotope.enigma.keymanagementbo.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Arrays;

public class OnLocalProfile implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return Arrays.binarySearch(context.getEnvironment().getActiveProfiles(), "local") != -1;
    }
}
