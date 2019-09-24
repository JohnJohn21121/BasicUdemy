package com.JohnJohn21121;

public class Main {

    public static void main(String[] args) {

    }

    public static int getLargestPrime(int number){
        if(number <=1){
            return -1;
        }
        int largestPrime=0;

        for (int i = 1; i <= number; i++){
            if (number % i == 0){
                int count = 0;
                int div = 1;
                while ( i >= div){
                    if (i % div == 0){
                        count = count +1;
                    }
                    div++;
                }
                if (count<=2){
                    largestPrime = i;
                }
            }
        }
        return largestPrime;
    }

}
