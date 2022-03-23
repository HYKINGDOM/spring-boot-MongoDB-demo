package com.java.mongo.org.config;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author HY
 */
@Component
public class MongoDBConfig implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        String user = "System";
        return Optional.of(user);
    }
}
