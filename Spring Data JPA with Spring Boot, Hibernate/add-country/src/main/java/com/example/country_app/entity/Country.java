package com.example.country_app.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "co_code")  // map to DB column
    private String code;

    @Column(name = "name")
    private String name;

    public Country() {
        // No-arg constructor needed for JPA
    }

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }


    // Getters and Setters

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
