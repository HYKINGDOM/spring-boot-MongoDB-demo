package com.java.mongo.org.infrastucture.dao;


import com.java.mongo.org.domain.User;
import com.java.mongo.org.infrastucture.entity.UserEntity;


public interface UserEntityRepository {

    void saveUser(User user);

    UserEntity findUserByUserName(String userName);

    long updateUser(UserEntity userEntity);

    void deleteUserById(Long id);
}
