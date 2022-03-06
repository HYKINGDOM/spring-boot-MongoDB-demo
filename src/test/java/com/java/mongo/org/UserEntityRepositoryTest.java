package com.java.mongo.org;


import com.java.mongo.org.dao.UserRepository;
import com.java.mongo.org.entity.UserEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserEntityRepositoryTest {

    @Autowired
    private UserRepository userDao;

    @Test
    public void testSaveUser() {
        UserEntity user = new UserEntity();
        user.setId(200000L);
        user.setUserName("秋田");
        user.setPassWord("weadawdawdaw456451@@@");
        userDao.saveUser(user);
    }

    @Test
    public void findUserByUserName() {
        UserEntity user = userDao.findUserByUserName("秋田");
        Assertions.assertNotNull(user.getId());
    }

    @Test
    public void updateUser() {
        UserEntity user = new UserEntity();
        user.setId(200000L);
        user.setUserName("秋田01");
        user.setPassWord("dwadawdawdaw");
        userDao.updateUser(user);
    }

    @Test
    public void deleteUserById() {
        userDao.deleteUserById(200000L);
    }

}
