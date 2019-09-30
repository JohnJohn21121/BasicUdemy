package com.JohnJohn21121;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("DeluxeBurger", "Sesame Seed", "BBQ Ribs", 7.55);
        super.addBurgerAddition1("Chips",3.50);
        super.addBurgerAddition2("Soda",3.00);
    }

    @Override
    public void addBurgerAddition1(String name, double price) {
        System.out.println("You cannot add additionals to a Deluxe Burger");
    }

    @Override
    public void addBurgerAddition2(String name, double price) {
        System.out.println("You cannot add additionals to a Deluxe Burger");
    }

    @Override
    public void addBurgerAddition3(String name, double price) {
        System.out.println("You cannot add additionals to a Deluxe Burger");
    }

    @Override
    public void addBurgerAddition4(String name, double price) {
        System.out.println("You cannot add additionals to a Deluxe Burger");
    }
}
