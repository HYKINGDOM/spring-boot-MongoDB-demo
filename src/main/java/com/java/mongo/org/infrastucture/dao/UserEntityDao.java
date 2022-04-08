package com.java.mongo.org.infrastucture.dao;

import com.java.mongo.org.infrastucture.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserEntityDao extends MongoRepository<UserEntity, String> {
}
