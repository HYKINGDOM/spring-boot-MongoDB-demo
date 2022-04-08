package com.java.mongo.org.controller;


import com.java.mongo.org.infrastucture.entity.BankEntity;
import com.java.mongo.org.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class BankController {

    @Autowired
    @Qualifier("bankServiceImpl")
    private BankService bankService;

    @Autowired
    @Qualifier("bankTakeServiceImpl")
    private BankService bankService01;


    @PostMapping
    public void testMongo() {
        BankEntity build = BankEntity.builder().build();
        System.out.println(bankService.updateByBankEntity(build));
    }

    @GetMapping
    public void testGetMongo() {
        BankEntity build = BankEntity.builder().build();
        System.out.println(bankService01.updateByBankEntity(build));
    }

}
