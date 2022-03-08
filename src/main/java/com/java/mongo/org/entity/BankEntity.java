package com.java.mongo.org.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Builder
@AllArgsConstructor
@Data
@Document(collection = "BankEntity")
public class BankEntity {

    private String value;

    private String primaryKey;

    private String realKey;

    private String createdBy;

    private LocalDateTime createdTimestamp;

    private String updatedBy;

    private LocalDateTime updatedTimestamp;

    private int version;
}
