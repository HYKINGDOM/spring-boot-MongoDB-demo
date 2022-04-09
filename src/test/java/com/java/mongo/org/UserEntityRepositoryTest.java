package com.java.mongo.org;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.java.mongo.org.infrastucture.dao.UserEntityDao;
import com.java.mongo.org.infrastucture.dao.UserEntityRepository;
import com.java.mongo.org.domain.User;
import com.java.mongo.org.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootTest
public class UserEntityRepositoryTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserEntityRepository userEntityRepository;

    @Autowired
    private UserEntityDao userEntityDao;

//    @Test
//    public void testSaveUser() {
//        User user = new User();
//        user.setId(200000L);
//        user.setUserName("秋田");
//        user.setPassWord("weadawdawdaw456451@@@");
//        userService.saveUser(user);
//    }

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
    @Test
    public void generate_user_json() {


        User user = new User();
        user.setId(200000L);
        user.setUserName("秋田");
        user.setPassWord("weadawdawdaw456451@@@");
        user.setUserEmail("123@ws.com");

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String toJson = gson.toJson(user);
        System.out.println(toJson);
    }

    @Test
    public void test_pattern_match() {
        String regex = "[^\\w.]";
        String input = "dwdasdasdasd";
        for (int i = 0; i < 10000; i++) {
            if (Pattern.matches(regex, input))
                System.out.println(Pattern.matches(regex, input));
        }
        boolean matches = Pattern.matches(regex, input);
        Assertions.assertTrue(matches);
    }


    @Test
    public void test_pattern_match_01() {
        String regex = "[\\w.]";
        String input = "@@!!!1@@@";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        boolean matches = m.find();
        Assertions.assertTrue(matches);

    }


}
