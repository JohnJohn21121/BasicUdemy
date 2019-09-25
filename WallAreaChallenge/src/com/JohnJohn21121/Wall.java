package com.JohnJohn21121;

public class Wall {

    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        if (height<0||width<0)
            return 0;
        else
            return this.height * this.width;
    }

    public double getWidth() {
        if (width<0)
            return 0;
        else
            return this.width;
    }

    public double getHeight() {
        if (height<0)
            return 0;
        else
            return  this.height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
