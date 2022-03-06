package com.java.mongo.org.service;

import com.java.mongo.org.dao.UserRepository;
import com.java.mongo.org.entity.UserEntity;
import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 创建对象
     * @param userEntity
     */
    @Override
    public void saveUser(UserEntity userEntity) {
        mongoTemplate.save(userEntity);
    }

    /**
     * 根据用户名查询对象
     * @param userName
     * @return
     */
    @Override
    public UserEntity findUserByUserName(String userName) {
        Query query=new Query(Criteria.where("userName").is(userName));
        UserEntity userEntity =  mongoTemplate.findOne(query , UserEntity.class);
        return userEntity;
    }

    /**
     * 更新对象
     * @param userEntity
     */
    @Override
    public long updateUser(UserEntity userEntity) {
        Query query=new Query(Criteria.where("id").is(userEntity.getId()));
        Update update= new Update().set("userName", userEntity.getUserName()).set("passWord", userEntity.getPassWord());
        //更新查询返回结果集的第一条
        UpdateResult result =mongoTemplate.updateFirst(query,update, UserEntity.class);
        //更新查询返回结果集的所有
        mongoTemplate.updateMulti(query, update, UserEntity.class);
        if(result!=null) {
            return result.getMatchedCount();
        } else {
            return 0;
        }
    }

    /**
     * 删除对象
     * @param id
     */
    @Override
    public void deleteUserById(Long id) {
        Query query=new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query, UserEntity.class);
    }
}
