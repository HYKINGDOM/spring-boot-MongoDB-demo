package com.java.mongo.org.service;

import com.java.mongo.org.domain.User;
import com.java.mongo.org.entity.UserEntity;

public interface UserService {

    void saveUser(User user);

    UserEntity findUserByUserName(String userName);

    long updateUser(UserEntity userEntity);

    void deleteUserById(Long id);
}
