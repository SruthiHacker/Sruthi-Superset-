package com.example.jpa_hibernate_springdata_compare.service;

import com.example.jpa_hibernate_springdata_compare.entity.Employee;
import com.example.jpa_hibernate_springdata_compare.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}
