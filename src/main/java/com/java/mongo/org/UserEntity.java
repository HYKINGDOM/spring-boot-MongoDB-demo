package com.java.mongo.org;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

/**
 * @author HY
 */
@Document(collection = "MGdatabase")
public class UserEntity implements Serializable {
    private static final long serialVersionUID = -3258839839160856613L;

    @Field("id")
    private Long id;

    @Field("userName")
    private String userName;

    @Field("passWord")
    private String passWord;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
