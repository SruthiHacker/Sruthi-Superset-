package com.cognizant.exercise3.service;

import com.cognizant.exercise3.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public double getAverageSalary(int deptId) {
        return employeeRepository.getAverageSalary(deptId);
    }
}
