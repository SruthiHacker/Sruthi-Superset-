package com.cognizant.exercise3;

import com.cognizant.exercise3.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercise3Application implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(Exercise3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		testGetAverageSalary();
	}

	private void testGetAverageSalary() {
		double avg = employeeService.getAverageSalary(1); // change to your dept ID
		System.out.println("Average Salary for Department 1: " + avg);
	}
}
