package com.java.mongo.org.dao;

import com.java.mongo.org.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserEntityDao extends MongoRepository<UserEntity, String> {
}
