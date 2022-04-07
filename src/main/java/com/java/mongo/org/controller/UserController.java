package com.java.mongo.org.controller;


import com.java.mongo.org.controller.request.UserRequest;
import com.java.mongo.org.controller.response.UserResponse;
import com.java.mongo.org.entity.UserEntity;
import com.java.mongo.org.mapper.UserMapper;
import com.java.mongo.org.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    private final UserMapper userMapper;

    @PostMapping("/info")
    public UserResponse getUserInfo(@RequestBody @Valid UserRequest userRequest) {
        UserEntity userByUserName = userService.findUserByUserName(userRequest.getUserName());
        return userMapper.toUserResponse(userByUserName);
    }
}
