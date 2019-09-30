package com.JohnJohn21121;

public class Hamburger {

    private String name;
    private String breadType;
    private String meat;
    private double price;

    private String additionName1;
    private double additionPrice1;

    private String additionName2;
    private double additionPrice2;

    private String additionName3;
    private double additionPrice3;

    private String additionName4;
    private double additionPrice4;

    public Hamburger(String name, String breadType, String meat, double price) {
        this.name = name;
        this.breadType = breadType;
        this.meat = meat;
        this.price = price;
    }

    public void addBurgerAddition1(String name,double price){
        this.additionName1=name;
        this.additionPrice1=price;
    }

    public void addBurgerAddition2(String name,double price){
        this.additionName2=name;
        this.additionPrice2=price;
    }

    public void addBurgerAddition3(String name,double price){
        this.additionName3=name;
        this.additionPrice3=price;
    }

    public void addBurgerAddition4(String name,double price){
        this.additionName4=name;
        this.additionPrice4=price;
    }

    public double hamburgerPrice(){
        double hamburgerPrice =this.price;
        System.out.println(this.name + " hamburger on a " + this.breadType + " roll " + " Price is " + this.price );
        if (this.additionName1 != null){
            hamburgerPrice += this.additionPrice1;
            System.out.println("Added " + additionName1 + " for an extra " + additionPrice1);
        }
        if (this.additionName2 != null){
            hamburgerPrice += this.additionPrice2;
            System.out.println("Added " + additionName2 + " for an extra " + additionPrice2);
        }
        if (this.additionName3 != null){
            hamburgerPrice += this.additionPrice3;
            System.out.println("Added " + additionName3 + " for an extra " + additionPrice3);
        }
        if (this.additionName4 != null){
            hamburgerPrice += this.additionPrice4;
            System.out.println("Added " + additionName4 + " for an extra " + additionPrice4);
        }
        return hamburgerPrice;
    }
}
