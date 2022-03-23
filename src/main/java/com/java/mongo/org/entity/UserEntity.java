package com.java.mongo.org.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author HY
 */
@Data
@Document(collection = "MGdatabase")
public class UserEntity implements Serializable {

    private static final long serialVersionUID = -3258839839160856613L;

    @Field("userId")
    private Long id;

    @Field("userName")
    private String userName;

    @Field("passWord")
    private String passWord;

    private String emailAddress;

    @CreatedBy
    private String createdBy;

    @CreatedDate
    private LocalDateTime createdTimestamp;

    @LastModifiedBy
    private String updatedBy;

    @LastModifiedDate
    private LocalDateTime updatedTimestamp;

    @Version
    private int version;
}
