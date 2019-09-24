package com.JohnJohn21121;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void inputThenPrintSumAndAverage (){
        Scanner scanner = new Scanner(System.in);

        double count=0;
        int sum = 0;

        while (true){
            boolean checkInt = scanner.hasNextInt();
            if (checkInt){
                int number = scanner.nextInt();
                sum += number;
                count++;
            }else {
                double average = sum/count;
                System.out.println("SUM = " + sum + " AVG = "+ Math.round(average));
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
