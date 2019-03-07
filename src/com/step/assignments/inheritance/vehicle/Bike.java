package com.step.assignments.inheritance.vehicle;

public class Bike extends Vehicle {

    private int gearCount;
    private String brakeType;
    private int currentGear ;

    public Bike(String name, String color, int gearCount, String brakeType, int currentGear) {
        super(name, color, 2);
        this.gearCount = gearCount;
        this.brakeType = brakeType;
        this.currentGear = 0;
    }

    public void accelerate(){
        this.currentGear++;
    }

    public void decelerate(){
        this.currentGear--;
    }

}
