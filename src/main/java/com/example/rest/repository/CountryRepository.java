package com.example.rest.repository;

import com.example.rest.model.Country;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CountryRepository extends MongoRepository<Country, String> {
    public Country findByCode(String code);
}
