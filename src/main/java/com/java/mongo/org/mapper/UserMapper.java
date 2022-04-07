package com.java.mongo.org.mapper;

import com.java.mongo.org.controller.response.UserResponse;
import com.java.mongo.org.domain.User;
import com.java.mongo.org.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    UserResponse toUserResponse(User user);


    UserResponse toUserResponse(UserEntity userEntity);
}
