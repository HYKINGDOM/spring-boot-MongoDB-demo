package com.java.mongo.org.controller.request;


import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class BankRequest {

    @NotBlank
    private String value;

    private String primaryKey;

    private String realKey;
}
