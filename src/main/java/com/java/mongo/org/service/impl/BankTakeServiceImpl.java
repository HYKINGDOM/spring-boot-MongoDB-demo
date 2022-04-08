package com.java.mongo.org.service.impl;

import com.java.mongo.org.infrastucture.entity.BankEntity;
import com.java.mongo.org.service.BankService;
import org.springframework.stereotype.Service;

@Service
public class BankTakeServiceImpl implements BankService {


    @Override
    public BankEntity updateByBankEntity(BankEntity bankEntity) {
        BankEntity bankEntity1 = BankEntity.builder().realKey("12345").build();

        return bankEntity1;
    }
}
