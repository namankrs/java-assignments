package com.step.assignments.inheritance.vehicle;

public class Audi extends Car{
    private String model;

    public Audi( String color, String model) {
        super("Audi", color, "automatic", true);
        this.model = model;
    }
    
    
    
}
