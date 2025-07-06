package com.example.country.controller;

import com.example.country.entity.Country;
import com.example.country.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @GetMapping("/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        return countryRepository.findByCode(code.toUpperCase());
    }
}
