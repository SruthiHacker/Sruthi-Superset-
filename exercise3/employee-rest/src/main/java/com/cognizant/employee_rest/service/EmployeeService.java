package com.cognizant.employee_rest.service;

import com.cognizant.employee_rest.dao.EmployeeDao;
import com.cognizant.employee_rest.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import java.util.List;

@Service  // ✅ Change from @Component to @Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }
}
