package com.example.country_app.service;

import com.example.country_app.entity.Country;
import com.example.country_app.repository.CountryRepository;
import com.example.country_app.exception.CountryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


import jakarta.transaction.Transactional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;
    @Autowired
    private CountryRepository repository;


    @Transactional
    public Country findCountryByCode(String code) throws CountryNotFoundException {
        return countryRepository.findById(code)
                .orElseThrow(() -> new CountryNotFoundException("Country not found with code: " + code));
    }

    public Country addCountry(Country country) {
        return repository.save(country);
    }

    // ✅ Method used in PUT - Update country
    public Country updateCountry(String code, Country updatedCountry) {
        Country existing = repository.findById(code)
                .orElseThrow(() -> new RuntimeException("Country not found: " + code));
        existing.setName(updatedCountry.getName());
        return repository.save(existing);
    }

    // ✅ Method used in DELETE
    public void deleteCountry(String code) {
        repository.deleteById(code);
    }

    // ✅ Method used in GET /countries/search?name=...
    public List<Country> searchByName(String partialName) {
        return repository.findByNameContainingIgnoreCase(partialName);
    }

    // You can add addCountry, updateCountry, deleteCountry etc. here too.
}
