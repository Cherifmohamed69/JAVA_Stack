package com.example.Dojo_and_Ninjas.Modells;

public class Ninja {
    private Long id;
    private String name;
    private Dojo dojo; // Foreign key relationship
    // Other attributes, getters, setters
    
    public Ninja() {
        // Default constructor
    }
    
    public Ninja(String name, Dojo dojo) {
        this.name = name;
        this.dojo = dojo;
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

    public Dojo getDojo() {
        return dojo;
    }

    public void setDojo(Dojo dojo) {
        this.dojo = dojo;
    }
}
