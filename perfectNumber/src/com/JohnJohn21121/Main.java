package com.JohnJohn21121;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum=0;
        for (int i = 1; i<number; i++){
            if ((number%i) !=0){
                continue;
            }else{
                sum = sum + i;
            }
        }
        if (sum == number){
            return true;
        }
        return false;
    }

}
