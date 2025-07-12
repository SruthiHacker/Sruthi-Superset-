package com.example.employee_xml_rest.controller;

import com.example.employee_xml_rest.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    private static final ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return Arrays.asList(
                (Employee) context.getBean("employee1"),
                (Employee) context.getBean("employee2")
        );
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        Employee emp1 = (Employee) context.getBean("employee1");
        Employee emp2 = (Employee) context.getBean("employee2");

        if (emp1.getId() == id) return emp1;
        if (emp2.getId() == id) return emp2;
        return null;
    }
}
