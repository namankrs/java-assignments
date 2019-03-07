package com.step.assignments.inheritance.vehicle;

public class Car extends Vehicle {

    private String gearType;
    private boolean abs;
    private int currentGear =0;

    public Car(String name, String color, String gearType, boolean abs) {
        super(name, color, 4);
        this.gearType = gearType;
        this.abs = abs;
    }

    public void move(){
        System.out.println("moving");
    }

    public void steer(){
        System.out.println("Hand-Steering");
    }

    public void changeGear(int gear){
        if(this.gearType == "manual") this.currentGear = gear;
    }

    public void paint(String color){
        super.changeColor(color);
    }

}
