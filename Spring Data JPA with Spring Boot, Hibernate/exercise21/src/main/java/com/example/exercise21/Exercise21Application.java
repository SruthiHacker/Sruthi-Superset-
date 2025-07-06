package com.example.exercise21;

import com.example.exercise21.model.Country;
import com.example.exercise21.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.List;

@SpringBootApplication
public class Exercise21Application implements CommandLineRunner {

	@Autowired
	private CountryService countryService;

	public static void main(String[] args) {
		SpringApplication.run(Exercise21Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("🔍 Countries containing 'ou':");
		List<Country> containsOu = countryService.searchCountriesByPartialName("ou");
		containsOu.forEach(c -> System.out.println(c.getCode() + " - " + c.getName()));

		System.out.println("\n🔍 Countries containing 'ou' (sorted):");
		List<Country> sortedOu = countryService.searchCountriesByPartialNameSorted("ou");
		sortedOu.forEach(c -> System.out.println(c.getCode() + " - " + c.getName()));

		System.out.println("\n🔤 Countries starting with 'Z':");
		List<Country> startsWithZ = countryService.getCountriesStartingWith("Z");
		startsWithZ.forEach(c -> System.out.println(c.getCode() + " - " + c.getName()));
	}
}

