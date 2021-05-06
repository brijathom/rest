package com.example.rest.controller;

import com.example.rest.model.Country;
import com.example.rest.repository.CountryRepository;
import java.util.List;
import java.util.Optional;

import com.example.rest.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    @Autowired
    public CountryService countryService;


    @RequestMapping("/get")
    public Country getPerson(@RequestParam String code) {
        return countryService.getByCode(code);
    }

    @RequestMapping("/getAll")
    public List<Country> getAll(){
        return countryService.getAll();
    }

}


