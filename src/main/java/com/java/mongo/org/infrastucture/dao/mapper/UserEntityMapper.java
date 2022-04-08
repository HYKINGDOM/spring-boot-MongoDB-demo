package com.java.mongo.org.infrastucture.dao.mapper;

import com.java.mongo.org.domain.User;
import com.java.mongo.org.infrastucture.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

/**
 * @author HY
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserEntityMapper {


    @Mappings({
            @Mapping(target = "emailAddress", source = "userEmail")
    })
    UserEntity toUserEntity(User user);
}
