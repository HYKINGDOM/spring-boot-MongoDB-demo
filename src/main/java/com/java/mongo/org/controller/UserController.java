package com.java.mongo.org.controller;


import com.java.mongo.org.controller.request.UserRequest;
import com.java.mongo.org.controller.response.UserResponse;
import com.java.mongo.org.controller.validator.UserCreate;
import com.java.mongo.org.controller.validator.UserSequence;
import com.java.mongo.org.controller.validator.UserSequenceDesc;
import com.java.mongo.org.controller.validator.UserSequenceExcludeDefault;
import com.java.mongo.org.controller.validator.UserUpdate;
import com.java.mongo.org.infrastucture.entity.UserEntity;
import com.java.mongo.org.mapper.UserMapper;
import com.java.mongo.org.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.groups.Default;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    private final UserMapper userMapper;

    @PostMapping("/create")
    public UserResponse createUserInfo(@RequestBody @Validated(value = UserCreate.class) UserRequest userRequest) {
        UserEntity userByUserName = userService.findUserByUserName(userRequest.getUserName());
        return userMapper.toUserResponse(userByUserName);
    }


    @PostMapping("/update")
    public UserResponse updateUserInfo(@Validated(value = UserUpdate.class) @RequestBody UserRequest userRequest) {
        UserEntity userByUserName = userService.findUserByUserName(userRequest.getUserName());
        return userMapper.toUserResponse(userByUserName);
    }

    @PostMapping("/information")
    public UserResponse getUserInformation(@Validated(value = Default.class) @RequestBody UserRequest userRequest) {
        UserEntity userByUserName = userService.findUserByUserName(userRequest.getUserName());
        return userMapper.toUserResponse(userByUserName);
    }

    @PostMapping("/information-default")
    public UserResponse getUserInformationDefault(@Validated @RequestBody UserRequest userRequest) {
        UserEntity userByUserName = userService.findUserByUserName(userRequest.getUserName());
        return userMapper.toUserResponse(userByUserName);
    }

    @PostMapping("/info")
    public UserResponse getUserInfo(@Validated(value = UserSequence.class) @RequestBody UserRequest userRequest) {
        UserEntity userByUserName = userService.findUserByUserName(userRequest.getUserName());
        return userMapper.toUserResponse(userByUserName);
    }


    @PostMapping("/info-desc")
    public UserResponse getUserInfoDesc(@Validated(value = UserSequenceDesc.class) @RequestBody UserRequest userRequest) {
        UserEntity userByUserName = userService.findUserByUserName(userRequest.getUserName());
        return userMapper.toUserResponse(userByUserName);
    }


    @PostMapping("/info-exclude-default")
    public UserResponse getUserInfoDefault(@Validated(value = UserSequenceExcludeDefault.class) @RequestBody UserRequest userRequest) {
        UserEntity userByUserName = userService.findUserByUserName(userRequest.getUserName());
        return userMapper.toUserResponse(userByUserName);
    }
}
