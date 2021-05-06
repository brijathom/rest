package com.example.rest.service;

import com.example.rest.model.Country;
import com.example.rest.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    public CountryRepository countryRepository;

    public List<Country> getAll() {
       return countryRepository.findAll();
    }

    public Country getByCode(String code) {
       return countryRepository.findByCode(code);
    }
}
