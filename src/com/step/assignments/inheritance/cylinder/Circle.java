package com.step.assignments.inheritance.cylinder;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = 0;
        if (radius > 0) this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI * this.radius*this.radius;
    }
}
