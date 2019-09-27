package com.JohnJohn21121;

public class EnchancedPlayer {
    private String name;
    private int hitPoints =100;
    private String weapon;

    public EnchancedPlayer(String name, int hitPoints, String weapon) {
        this.name = name;
        if (hitPoints >0&& hitPoints <=100) {
            this.hitPoints = hitPoints;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){

        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints <=0){
            System.out.println("Player Knocked out");
            // reduce number of lives remaining for the player.
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
