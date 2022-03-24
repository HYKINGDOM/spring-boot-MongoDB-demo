package com.java.mongo.org.dao;

import com.java.mongo.org.dao.mapper.UserEntityMapper;
import com.java.mongo.org.domain.User;
import com.java.mongo.org.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;


@RequiredArgsConstructor
@Component
public class UserEntityRepositoryImpl implements UserEntityRepository {

    private final UserEntityDao userEntityDao;

    private final UserEntityMapper userEntityMapper;


    @Override
    public void saveUser(User user) {
        UserEntity userEntity = userEntityMapper.toUserEntity(user);
        userEntity.setCreatedTimestamp(LocalDateTime.now());
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
