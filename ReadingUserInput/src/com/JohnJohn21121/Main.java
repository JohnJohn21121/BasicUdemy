package com.JohnJohn21121;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Year of Birth: ");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your Name: ");
            String name = scanner.nextLine();
            int age = 2019-yearOfBirth;

            if (age >=0 && age<=100){
                System.out.println("Your Name is " + name + ", and you are : " + age + " Years old.");
            } else{
                System.out.println("Invalid Year of Birth");
            }
        } else {
            System.out.println("Unable to Parse the Year of Birth");
        }
        scanner.close();
    }
}
