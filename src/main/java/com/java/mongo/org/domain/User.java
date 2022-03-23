package com.java.mongo.org.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    private Long id;

    private String userName;

    private String passWord;

    private String userEmail;

}
