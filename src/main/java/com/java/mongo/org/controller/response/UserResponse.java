package com.java.mongo.org.controller.response;

import com.java.mongo.org.config.EmailValid;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserResponse {

    private String userName;

    private String passWord;

    @NotEmpty
    @EmailValid(message = "email failed")
    private String userEmail;
}
