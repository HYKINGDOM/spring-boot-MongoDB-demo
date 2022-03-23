package com.java.mongo.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

/**
 * @author HY
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableMongoAuditing
@EnableJpaRepositories
public class SpringBootMongoDbDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMongoDbDemoApplication.class, args);
    }

}
