package com.JohnJohn21121;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic","Brown","Patty", 3.40);
        double price = hamburger.hamburgerPrice();
        hamburger.addBurgerAddition1("Bacon",0.75);
        hamburger.addBurgerAddition2("Tomato",0.50);
        hamburger.addBurgerAddition3("Avocado", 0.80);
        System.out.println("Total Hamburger price is " + hamburger.hamburgerPrice());

        HealthyBurger healthyBurger = new HealthyBurger("Pork",5.85);
        double healthyPrice = healthyBurger.hamburgerPrice();
        healthyBurger.addHealthyAddition1("Onion" , 3.50);
        healthyBurger.addHealthyAddition2("Tomato",1.25);
        System.out.println("Total Healthy Hamburger price is " + healthyBurger.hamburgerPrice());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.hamburgerPrice();
        deluxeBurger.addBurgerAddition1("Dog",40);
        System.out.println("Total Delux Hamburger price is " + deluxeBurger.hamburgerPrice());
    }

}
