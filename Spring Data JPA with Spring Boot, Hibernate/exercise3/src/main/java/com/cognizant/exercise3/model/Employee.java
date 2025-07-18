package com.cognizant.exercise3.model;

import jakarta.persistence.*;

@Entity
public class Employee {

    @Id
    private int id;
    private String name;
    private double salary;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    // Getters and Setters
}
