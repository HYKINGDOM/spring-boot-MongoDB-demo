package com.java.mongo.org;


import com.java.mongo.org.dao.UserRepository;
import com.java.mongo.org.entity.BankEntity;
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
    public void test_first_create_user() {
        BankEntity build = BankEntity.builder().realKey("11111111").primaryKey("22222222").value("333333333").build();
        long count = userDao.updateByBankEntity(build);
        Assertions.assertEquals(1, count);
    }


    @Test
    public void test_second_create_user_same_key() {
        BankEntity build = BankEntity.builder().realKey("101").primaryKey("102").value("103").build();
        userDao.updateByBankEntity(build);

        BankEntity build02 = BankEntity.builder().realKey("101").primaryKey("102").value("105").build();
        long count = userDao.updateByBankEntity(build02);
        Assertions.assertEquals(1, count);
    }

    @Test
    public void test_second_create_user_not_same_key() {
        BankEntity build = BankEntity.builder().realKey("101").primaryKey("102").value("103").build();
        userDao.updateByBankEntity(build);

        BankEntity build02 = BankEntity.builder().realKey("101").primaryKey("102").value("105").build();
        userDao.updateByBankEntity(build02);

        BankEntity build03 = BankEntity.builder().realKey("101").primaryKey("102-2").value("105-5").build();
        long count3 = userDao.updateByBankEntity(build03);

        BankEntity build04 = BankEntity.builder().realKey("101-1").primaryKey("102").value("103-1").build();
        userDao.updateByBankEntity(build04);

        BankEntity build05 = BankEntity.builder().realKey("101-2").primaryKey("102-1").value("103-1").build();
        userDao.updateByBankEntity(build05);
        Assertions.assertEquals(1, count3);
    }

    @Test
    public void deleteUserById() {
        userDao.deleteUserById(200000L);
    }


}
