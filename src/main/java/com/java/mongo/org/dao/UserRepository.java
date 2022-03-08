package com.java.mongo.org.dao;

import com.java.mongo.org.entity.BankEntity;
import com.java.mongo.org.entity.UserEntity;

public interface UserRepository {
    void saveUser(UserEntity userEntity);

    UserEntity findUserByUserName(String userName);

    long updateUser(UserEntity userEntity);

    long updateByBankEntity(BankEntity bankEntity);

    void deleteUserById(Long id);
}
