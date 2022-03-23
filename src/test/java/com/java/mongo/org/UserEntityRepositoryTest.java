package com.java.mongo.org;


import com.java.mongo.org.dao.UserEntityDao;
import com.java.mongo.org.dao.UserEntityRepository;
import com.java.mongo.org.domain.User;
import com.java.mongo.org.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserEntityRepositoryTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserEntityRepository userEntityRepository;

    @Autowired
    private UserEntityDao userEntityDao;

    @Test
    public void testSaveUser() {
        User user = new User();
        user.setId(200000L);
        user.setUserName("秋田");
        user.setPassWord("weadawdawdaw456451@@@");
        userService.saveUser(user);
    }
//
//    @Test
//    public void findUserByUserName() {
//        UserEntity user = userService.findUserByUserName("秋田");
//        Assertions.assertNotNull(user.getId());
//    }
//
//    @Test
//    public void updateUser() {
//        UserEntity user = new UserEntity();
//        user.setId(200000L);
//        user.setUserName("秋田01");
//        user.setPassWord("dwadawdawdaw");
//        userService.updateUser(user);
//    }
//
//
//
//    @Test
//    public void deleteUserById() {
//        userService.deleteUserById(200000L);
//    }


}
