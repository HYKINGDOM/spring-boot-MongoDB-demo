package com.java.mongo.org.service.impl;

import com.java.mongo.org.entity.BankEntity;
import com.java.mongo.org.service.BankService;
import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BankServiceImpl implements BankService {


    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public BankEntity updateByBankEntity(BankEntity bankEntity) {
        Query query = new Query(Criteria
                .where("primaryKey").is(bankEntity.getPrimaryKey())
                .and("realKey").is(bankEntity.getRealKey()));
        BankEntity bankEntityOne = mongoTemplate.findOne(query, BankEntity.class);

        if ((bankEntityOne == null)) {
            bankEntity.setCreatedBy(bankEntity.getRealKey());
            bankEntity.setCreatedTimestamp(LocalDateTime.now());
            bankEntity.setVersion(1);
            mongoTemplate.save(bankEntity);
            return mongoTemplate.findOne(query, BankEntity.class);
        }

        Update update = new Update()
                .set("value", bankEntity.getValue())
                .set("updatedBy", bankEntity.getRealKey())
                .set("updatedTimestamp", LocalDateTime.now())
                .set("version", bankEntityOne.getVersion() + 1);
        UpdateResult result = mongoTemplate.updateFirst(query, update, BankEntity.class);

        System.out.println(result.getMatchedCount());

        return mongoTemplate.findOne(query, BankEntity.class);

    }
}
