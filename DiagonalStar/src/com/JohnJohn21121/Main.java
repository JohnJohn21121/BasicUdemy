package com.JohnJohn21121;

public class Main {

    public static void main(String[] args) {
        printSquareStar(10);
        printSquareStar(4);
        printSquareStar(12);

    }

    public static void printSquareStar (int number){
        if (number <5){
            System.out.println("Invalid Value");
            return;
        }

        for (int i=1; i <= number; i++ ){
            for (int j=1; j<=number; j++){
                if (i==1|| j==1||i==number||j==number||i==j|| j == (number -i + 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

}
