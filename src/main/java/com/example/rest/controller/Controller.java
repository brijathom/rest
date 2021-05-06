package com.example.rest.controller;

import com.example.rest.model.Country;
import com.example.rest.repository.CountryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    public CountryRepository countryRepository;

    @GetMapping(value = "/all")
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

}
