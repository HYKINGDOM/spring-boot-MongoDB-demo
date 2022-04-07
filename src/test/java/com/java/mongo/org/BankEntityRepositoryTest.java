package com.java.mongo.org;

import com.java.mongo.org.dao.UserEntityRepository;
import com.java.mongo.org.entity.BankEntity;
import com.java.mongo.org.service.BankService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class BankEntityRepositoryTest {


//    @Autowired
//    private BankService userDao;
//
//    @Test
//    public void test_second_create_user_not_same_key() {
//        BankEntity build = BankEntity.builder().realKey("101").primaryKey("102").value("103").build();
//        userDao.updateByBankEntity(build);
//
//        BankEntity build02 = BankEntity.builder().realKey("101").primaryKey("102").value("105").build();
//        BankEntity bankEntity = userDao.updateByBankEntity(build02);
//        Assertions.assertEquals("101", bankEntity.getCreatedBy());
//        Assertions.assertEquals("101", bankEntity.getUpdatedBy());
//
//        BankEntity build03 = BankEntity.builder().realKey("101").primaryKey("102-2").value("105-5").build();
//        userDao.updateByBankEntity(build03);
//
//        BankEntity build04 = BankEntity.builder().realKey("101-1").primaryKey("102").value("103-1").build();
//        userDao.updateByBankEntity(build04);
//
//        BankEntity build05 = BankEntity.builder().realKey("101-2").primaryKey("102-1").value("103-1").build();
//        userDao.updateByBankEntity(build05);
//
//    }
}
