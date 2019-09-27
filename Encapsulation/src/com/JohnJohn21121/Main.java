package com.JohnJohn21121;

public class Main {

    public static void main(String[] args) {

        Player player = new Player();
        player.name = "John";
        player.health = 20;
        player.weapon = "Sword";

        int damage =10;
        player.loseHealth(damage);
        System.out.println("Remaining Health = " + player.healthReamining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining Health = " + player.healthReamining());

        //All of this section above is the example of no encapsulation, the rest below is an example of good encapsulation
        // as Tim Buchalka says.

        EnchancedPlayer ePlayer = new EnchancedPlayer("John",200, "Axe");
        System.out.println("Initial health is " + ePlayer.getHealth());
    }
}
