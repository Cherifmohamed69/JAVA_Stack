package com.example.Dojo_and_Ninjas.Modells;

import java.util.ArrayList;
import java.util.List;

public class Dojo {
    private Long id;
    private String name;
    private List<Ninja> ninjas; // To store associated ninjas
    
    public Dojo() {
        // Default constructor
        ninjas = new ArrayList<>();
    }
    
    public Dojo(String name) {
        this.name = name;
        ninjas = new ArrayList<>();
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public List<Ninja> getNinjas() {
        return ninjas;
    }
    
    public void addNinja(Ninja ninja) {
        ninjas.add(ninja);
    }
    
    // Other getters and setters for manipulating ninjas
}
