package com.java.mongo.org.controller;


import com.java.mongo.org.controller.request.UserRequest;
import com.java.mongo.org.controller.response.UserResponse;
import com.java.mongo.org.controller.validator.UserCreate;
import com.java.mongo.org.infrastucture.entity.UserEntity;
import com.java.mongo.org.mapper.UserMapper;
import com.java.mongo.org.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    private final UserMapper userMapper;

    @PostMapping("/create")
    public UserResponse createUserInfo(@RequestBody @Validated UserRequest userRequest) {
        UserEntity userByUserName = userService.findUserByUserName(userRequest.getUserName());
        return userMapper.toUserResponse(userByUserName);
    }


    @PostMapping("/update")
    public UserResponse updateUserInfo(@RequestBody @Validated UserRequest userRequest) {
        UserEntity userByUserName = userService.findUserByUserName(userRequest.getUserName());
        return userMapper.toUserResponse(userByUserName);
    }

    @PostMapping("/info")
    public UserResponse getUserInfo(@RequestBody @Validated UserRequest userRequest) {
        UserEntity userByUserName = userService.findUserByUserName(userRequest.getUserName());
        return userMapper.toUserResponse(userByUserName);
    }
}
