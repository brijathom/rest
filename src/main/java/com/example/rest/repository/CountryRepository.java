package com.example.rest.repository;

import com.example.rest.model.Country;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

// A repository is an interface that lets
// you perform various operations involving Country objects.
// Most of these operations are obtained by extending the
// MongoRepository interface that is defined in the Spring frameword.
@Repository
public interface CountryRepository extends MongoRepository<Country, String> {
    public Country findByCode(String code);
}
