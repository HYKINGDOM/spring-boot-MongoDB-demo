package com.java.mongo.org.controller.request;


import com.java.mongo.org.config.EmailValid;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

/**
 * @author HY
 */
@Builder
@Data
public class UserRequest {

    @NotEmpty
    @NotBlank(message = "user name is blank")
    private String userName;

    @NotEmpty
    @NotBlank(message = "password failed")
    private String passWord;

    @NotEmpty
    @EmailValid(message = "email failed")
    private String userEmail;
}
