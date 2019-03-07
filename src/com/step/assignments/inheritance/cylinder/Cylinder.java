package com.step.assignments.inheritance.cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = 0;
        if(height>0) this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return super.getArea() * this.height;
    }
}
