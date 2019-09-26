package com.JohnJohn21121;

public class Circle {

    private double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    public double getRadius() {
        if (radius<0)
            return 0;
        else
            return radius;
    }
    public double getArea(){
        return (radius*radius*Math.PI);
    }

}
