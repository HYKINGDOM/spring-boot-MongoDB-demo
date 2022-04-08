package com.java.mongo.org.controller.request;


import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
public class BankRequest {

    @NotBlank
    private String value;

    private String primaryKey;

    private String realKey;
}
