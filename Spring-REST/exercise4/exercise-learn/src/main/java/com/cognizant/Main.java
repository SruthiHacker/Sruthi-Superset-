package com.cognizant;

import com.cognizant.dao.DepartmentDaoImpl;
import com.cognizant.service.DepartmentServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

@SpringBootApplication
@ImportResource("classpath:department.xml")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public DepartmentServiceImpl departmentService(DepartmentDaoImpl departmentDao) {
        DepartmentServiceImpl service = new DepartmentServiceImpl();
        service.setDepartmentDao(departmentDao);
        return service;
    }
}
