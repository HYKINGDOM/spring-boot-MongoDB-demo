package com.java.mongo.org.controller;

import com.java.mongo.org.domain.User;
import com.java.mongo.org.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mongo")
public class MongoDBController {

    @Autowired
    private UserService userService;

    @PostMapping
    public void testMongo() {
        User user = new User();
        user.setId(200000L);
        user.setUserName("秋田");
        user.setPassWord("weadawdawdaw456451@@@");
        userService.saveUser(user);
    }
}
