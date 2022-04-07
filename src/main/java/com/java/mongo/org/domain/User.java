package com.java.mongo.org.domain;

import com.java.mongo.org.config.EmailValid;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotEmpty;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    private Long id;

    private String userName;

    private String passWord;
    @NotEmpty
    @EmailValid(message = "email failed")
    private String userEmail;

}
