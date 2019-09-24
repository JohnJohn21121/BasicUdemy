package com.company;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(3);
        printDayOfTheWeek(1);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
        printNumberInWord(0);
        printNumberInWord(3);
        printNumberInWord(8);
        printNumberInWord(9);
        printNumberInWord(10);
        printNumberInWord(-2);
        printNumberInWord(1);
    }
    public static void printDayOfTheWeek (int day){

        switch (day){

            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid Day");
                break;

        }
    }

    public static void printNumberInWord(int number){

        switch (number){

            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;

            default:
                System.out.println("Other");
        }
    }
}
