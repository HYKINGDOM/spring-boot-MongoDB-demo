package com.java.mongo.org.controller.request;


import com.java.mongo.org.config.PassWordValid;
import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

/**
 * @author HY
 */
@Validated
@Builder
@Data
public class UserRequest {

    @Length(min = 8, max = 20, message = "%s length failed")
    @NotBlank(message = "%s is blank")
    private String userName;

    @NotEmpty(message = "empty %s failed")
    private String userAccountNum;


    @Length(min = 8, max = 20, message = "%s length failed")
    @NotEmpty(message = "empty %s failed")
    private String niceName;

    @Max(value = 99, message = "max %s is failed")
    @Min(value = 10, message = "min %s is failed")
    private Integer age;

    @PassWordValid(pattern = "[\\w.]", message = "password faild")
    @Length(min = 8, max = 20, message = "%s length failed")
    @NotBlank(message = "password %s failed")
    private String passWord;

    @Email(message = "email failed")
    @NotEmpty(message = "empty %s failed")
    private String userEmail;
}
