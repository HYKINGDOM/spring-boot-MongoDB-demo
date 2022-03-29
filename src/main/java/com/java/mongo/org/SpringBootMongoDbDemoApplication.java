package com.java.mongo.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author HY
 */
@SpringBootApplication
@EnableMongoAuditing
@EnableJpaRepositories
public class SpringBootMongoDbDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMongoDbDemoApplication.class, args);
    }

}
