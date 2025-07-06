package com.example.onetomany.service;

import com.example.onetomany.model.Department;
import com.example.onetomany.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department get(int id) {
        Optional<Department> result = departmentRepository.findById(id);
        return result.orElse(null);
    }
}
