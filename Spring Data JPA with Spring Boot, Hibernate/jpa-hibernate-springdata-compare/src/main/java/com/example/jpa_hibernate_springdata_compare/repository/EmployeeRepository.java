package com.example.jpa_hibernate_springdata_compare.repository;

import com.example.jpa_hibernate_springdata_compare.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
