package com.capg.dac.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capg.dac.model.FoodApp;

@Repository
public interface FoodRepository extends MongoRepository<FoodApp, Integer>{

	

}
