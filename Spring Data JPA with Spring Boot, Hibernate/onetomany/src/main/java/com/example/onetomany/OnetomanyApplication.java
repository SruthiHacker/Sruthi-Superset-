package com.example.onetomany;

import com.example.onetomany.model.Department;
import com.example.onetomany.model.Employee;
import com.example.onetomany.service.DepartmentService;
import com.example.onetomany.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnetomanyApplication implements CommandLineRunner {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private DepartmentService departmentService;

	public static void main(String[] args) {
		SpringApplication.run(OnetomanyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		testGetDepartment();
	}

	private void testGetDepartment() {
		// Save department (optional, for testing)
		Department department = new Department();
		department.setName("HR");
		departmentRepository.save(department);

		// Fetch department and print employees
		Department dept = departmentService.get(1); // ID must match the type
		System.out.println("Department: " + dept);
		if (dept != null && dept.getEmployeeList() != null) {
			for (Employee emp : dept.getEmployeeList()) {
				System.out.println("Employee: " + emp);
			}
		}
	}
}
