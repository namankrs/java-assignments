package com.step.assignments.inheritance.poolArea;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = 0;
        this.length = 0;
        if (width > 0) this.width = width;
        if (length > 0) this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return this.length*this.width;
    }
}
