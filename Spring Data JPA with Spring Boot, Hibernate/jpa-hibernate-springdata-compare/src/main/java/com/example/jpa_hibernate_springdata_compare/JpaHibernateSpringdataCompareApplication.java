package com.example.jpa_hibernate_springdata_compare;

import com.example.jpa_hibernate_springdata_compare.dao.HibernateEmployeeDAO;
import com.example.jpa_hibernate_springdata_compare.entity.Employee;
import com.example.jpa_hibernate_springdata_compare.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaHibernateSpringdataCompareApplication implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(JpaHibernateSpringdataCompareApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee emp = new Employee();
		emp.setName("Sruthi");
		emp.setDepartment("Development");

		// Spring Data JPA
		employeeService.addEmployee(emp);

		// Hibernate
		HibernateEmployeeDAO dao = new HibernateEmployeeDAO();
		dao.addEmployee(emp);
	}
}
