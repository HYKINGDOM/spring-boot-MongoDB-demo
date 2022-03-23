package com.java.mongo.org.dao;

import com.java.mongo.org.entity.BankEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author HY
 */
public interface BankEntityRepository extends MongoRepository<BankEntity, String> {

    BankEntity updateByBankEntity(BankEntity bankEntity);
}
