package com.java.mongo.org.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

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
}
