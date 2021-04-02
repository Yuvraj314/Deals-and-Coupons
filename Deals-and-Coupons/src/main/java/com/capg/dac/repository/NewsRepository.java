package com.capg.dac.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capg.dac.model.News;

@Repository
public interface NewsRepository extends MongoRepository<News, Integer>{

}
