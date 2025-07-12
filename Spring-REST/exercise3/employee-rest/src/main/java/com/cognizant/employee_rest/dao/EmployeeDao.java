package com.cognizant.employee_rest.dao;

import com.cognizant.employee_rest.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDao {
    private static List<Employee> EMPLOYEE_LIST = new ArrayList<>();

    static {
        EMPLOYEE_LIST.add(new Employee(1, "Ram", 50000));
        EMPLOYEE_LIST.add(new Employee(2, "Priya", 60000));
        EMPLOYEE_LIST.add(new Employee(3, "Arun", 70000));
        EMPLOYEE_LIST.add(new Employee(4, "Divya", 80000));
    }

    public List<Employee> getAllEmployees() {
        return EMPLOYEE_LIST;
    }
}
