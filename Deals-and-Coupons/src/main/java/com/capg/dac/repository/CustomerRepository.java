package com.capg.dac.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capg.dac.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer>{

}
