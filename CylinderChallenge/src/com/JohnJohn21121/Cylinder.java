package com.JohnJohn21121;

public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        if (height<0)
            return 0;
        else
            return height;
    }

    public double getVolume(){
        return (getArea()*getHeight());
    }
}
