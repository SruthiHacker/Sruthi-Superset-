package com.cognizant.model;

public class Skill {
    private int id;
    private String name;

    public Skill() {}

    public Skill(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
