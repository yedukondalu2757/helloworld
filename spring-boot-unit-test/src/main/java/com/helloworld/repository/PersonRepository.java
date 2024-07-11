package com.helloworld.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.helloworld.model.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, Integer>{

}
