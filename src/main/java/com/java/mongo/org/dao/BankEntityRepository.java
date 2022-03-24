package com.java.mongo.org.dao;

import com.java.mongo.org.entity.BankEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author HY
 */
@Repository
public interface BankEntityRepository extends MongoRepository<BankEntity, String> {

}
