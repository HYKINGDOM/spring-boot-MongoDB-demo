package com.java.mongo.org;

public interface UserRepository {
    void saveUser(UserEntity userEntity);

    UserEntity findUserByUserName(String userName);

    long updateUser(UserEntity userEntity);

    void deleteUserById(Long id);
}
