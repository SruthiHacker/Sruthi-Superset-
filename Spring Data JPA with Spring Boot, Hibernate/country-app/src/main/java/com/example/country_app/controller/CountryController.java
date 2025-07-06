package com.example.country_app.controller;

import com.example.country_app.entity.Country;
import com.example.country_app.exception.CountryNotFoundException;
import com.example.country_app.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService service;

    @GetMapping("/{code}")
    public Country getByCode(@PathVariable String code) throws CountryNotFoundException {
        return service.findCountryByCode(code);
    }

    @PostMapping
    public Country add(@RequestBody Country country) {
        return service.addCountry(country);
    }

    @PutMapping("/{code}")
    public Country update(@PathVariable String code, @RequestBody Country updatedCountry) {
        return service.updateCountry(code, updatedCountry);
    }

    @DeleteMapping("/{code}")
    public void delete(@PathVariable String code) {
        service.deleteCountry(code);
    }

    @GetMapping("/search")
    public List<Country> searchByName(@RequestParam String name) {
        return service.searchByName(name);
    }
}
