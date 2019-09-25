package com.JohnJohn21121;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void add(double real, double imaginary){
        this.real +=real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber complexNumber1){
        add(complexNumber1.getReal(),complexNumber1.getImaginary());
    }

    public void subtract(double real, double imaginary){
        add((real*-1),(imaginary*-1));
    }

    public void subtract(ComplexNumber complexNumber1){
        subtract(complexNumber1.getReal(),complexNumber1.getImaginary());
    }

}
