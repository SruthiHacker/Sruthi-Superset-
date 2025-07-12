package com.cognizant;

import com.cognizant.dao.EmployeeDao;
import com.cognizant.model.Employee;

public class Main {
    public static void main(String[] args) {
        EmployeeDao dao = new EmployeeDao();

        for (Employee emp : dao.getAllEmployees()) {
            System.out.println("ID: " + emp.getId() + ", Name: " + emp.getName());
        }
    }
}
