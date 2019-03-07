package com.step.assignments.inheritance.vehicle;

public class Vehicle {
    private String name;
    private String color;
    private int wheels;


    public Vehicle(String name, String color, int wheels) {
        this.name = name;
        this.color = color;
        this.wheels = wheels;
    }

    public void changeColor( String color){
        this.color = color;
    }
}
