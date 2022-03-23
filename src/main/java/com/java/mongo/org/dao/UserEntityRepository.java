package com.java.mongo.org.dao;


import com.java.mongo.org.domain.User;
import com.java.mongo.org.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserEntityRepository {

    void saveUser(User user);

    UserEntity findUserByUserName(String userName);

    long updateUser(UserEntity userEntity);

    void deleteUserById(Long id);
}
