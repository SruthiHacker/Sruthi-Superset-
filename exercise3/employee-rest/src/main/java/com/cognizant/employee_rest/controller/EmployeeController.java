package com.cognizant.employee_rest.controller;

import com.cognizant.employee_rest.model.Employee;
import com.cognizant.employee_rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")  // ✅ URL for GET request
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}
