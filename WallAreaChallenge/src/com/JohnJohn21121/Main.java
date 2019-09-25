package com.JohnJohn21121;

public class Main {

    public static void main(String[] args) {

        Wall wallA = new Wall(5,4);
        System.out.println("Area of wallA = " +wallA.getArea());


        wallA.setHeight(-1.5);
        System.out.println("Width = " + wallA.getWidth());
        System.out.println("Height = " + wallA.getHeight());
        System.out.println("Area = " + wallA.getArea());
    }
}
