package com.java.mongo.org.dao;

import com.java.mongo.org.dao.mapper.UserEntityMapper;
import com.java.mongo.org.domain.User;
import com.java.mongo.org.entity.UserEntity;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@AllArgsConstructor
@Repository
public class UserEntityRepositoryImpl implements UserEntityRepository {

    private final UserEntityDao userEntityDao;

    private final UserEntityMapper userEntityMapper;


    @Override
    public void saveUser(User user) {
        UserEntity userEntity = userEntityMapper.toUserEntity(user);
        UserEntity saved = userEntityDao.save(userEntity);
        System.out.println(saved.toString());
    }

    @Override
    public UserEntity findUserByUserName(String userName) {
        return null;
    }

    @Override
    public long updateUser(UserEntity userEntity) {
        return 0;
    }

    @Override
    public void deleteUserById(Long id) {

    }
}
