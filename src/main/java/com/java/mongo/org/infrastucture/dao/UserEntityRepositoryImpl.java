package com.java.mongo.org.infrastucture.dao;

import com.java.mongo.org.infrastucture.dao.mapper.UserEntityMapper;
import com.java.mongo.org.domain.User;
import com.java.mongo.org.infrastucture.entity.UserEntity;
import com.java.mongo.org.infrastucture.entity.UserNameEntity;
import com.java.mongo.org.infrastucture.entity.UserQueryCondition;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.CriteriaDefinition;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
@Component
public class UserEntityRepositoryImpl implements UserEntityRepository {

    private final UserEntityDao userEntityDao;

    private final UserEntityMapper userEntityMapper;


    @Transactional
    @Override
    public void saveUser(User user) {
        UserEntity userEntity = userEntityMapper.toUserEntity(user);
        UserNameEntity userNameEntity1 = UserNameEntity.builder().nikeName("test1").shortName("qwer1").build();
        UserNameEntity userNameEntity2 = UserNameEntity.builder().nikeName("test2").shortName("qwer2").build();
        userEntity.setUserNameEntities(List.of(userNameEntity1, userNameEntity2));
        userEntity.setCreatedTimestamp(LocalDateTime.now());
        UserEntity saved = userEntityDao.save(userEntity);
    }

    @Override
    public UserEntity findUserByUserName(String userName) {
        UserNameEntity userNameEntity1 = UserNameEntity.builder().nikeName("test1").shortName("qwer1").build();
        UserEntity userEntity = new UserEntity();
        List<UserNameEntity> arrayList = new ArrayList<>();
        arrayList.add(userNameEntity1);
        userEntity.setUserNameEntities(arrayList);

        List<UserEntity> all = userEntityDao.findAll(Example.of(userEntity));

        return all.stream().findFirst().orElse(null);
    }

    @Override
    public long updateUser(UserEntity userEntity) {
        return 0;
    }

    @Override
    public void deleteUserById(Long id) {

    }
}
