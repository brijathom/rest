package com.example.rest.controller;

import com.example.rest.model.Country;
import com.example.rest.service.CountryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// The controller controls the way in which users interact with the API.
@RestController
public class CountryController {

    @Autowired
    public CountryService countryService;

    @RequestMapping("/get")
    public Country getPerson(@RequestParam String code) {
        return countryService.getByCode(code);
    }

    @RequestMapping("/get-all")
    public List<Country> getAll(){
        return countryService.getAll();
    }

}


