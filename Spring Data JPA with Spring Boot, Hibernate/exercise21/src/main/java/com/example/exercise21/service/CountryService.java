package com.example.exercise21.service;

import com.example.exercise21.model.Country;
import com.example.exercise21.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional(readOnly = true)
    public List<Country> searchCountriesByPartialName(String namePart) {
        return countryRepository.findByNameContainingIgnoreCase(namePart);
    }

    @Transactional(readOnly = true)
    public List<Country> searchCountriesByPartialNameSorted(String namePart) {
        return countryRepository.findByNameContainingIgnoreCaseOrderByNameAsc(namePart);
    }

    @Transactional(readOnly = true)
    public List<Country> getCountriesStartingWith(String letter) {
        return countryRepository.findByNameStartingWithIgnoreCase(letter);
    }
}
