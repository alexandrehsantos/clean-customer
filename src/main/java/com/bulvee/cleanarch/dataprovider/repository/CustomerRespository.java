package com.bulvee.cleanarch.dataprovider.repository;

import com.bulvee.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRespository extends MongoRepository<CustomerEntity, String> {
}
