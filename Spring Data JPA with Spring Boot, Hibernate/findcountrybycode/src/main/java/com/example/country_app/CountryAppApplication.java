package com.example.country_app;

import com.example.country_app.entity.Country;
import com.example.country_app.exception.CountryNotFoundException;
import com.example.country_app.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CountryAppApplication implements CommandLineRunner {

	@Autowired
	private CountryService countryService;

	public static void main(String[] args) {
		SpringApplication.run(CountryAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// ✅ Test: Find country by code
		try {
			Country country = countryService.findCountryByCode("IN");
			System.out.println("Found country: " + country);
		} catch (CountryNotFoundException e) {
			System.out.println(e.getMessage());
		}

		// ✅ Test: Add new country
		Country newCountry = new Country("ZZ", "Zootopia");
		countryService.addCountry(newCountry);
		System.out.println("Added: " + newCountry);

		// ✅ Test: Update country
		Country updatedData = new Country("ZZ", "Zootopia Updated");
		Country updated = countryService.updateCountry("ZZ", updatedData);
		System.out.println("Updated: " + updated);

		// ✅ Test: Find countries by partial name
		List<Country> list = countryService.searchByName("land");
		System.out.println("Countries with 'land' in name:");
		list.forEach(System.out::println);

		// ✅ Test: Delete country
		countryService.deleteCountry("ZZ");
		System.out.println("Deleted country with code ZZ");
	}
}
