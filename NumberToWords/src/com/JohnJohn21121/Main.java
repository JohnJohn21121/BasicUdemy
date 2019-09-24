package com.JohnJohn21121;

public class Main {

    public static void main(String[] args) {
        numberToWords(434);
    }
        public static void numberToWords(int number) {
        if (number < 0)
            System.out.println ( "Invalid Value" );
        if (number == 0)
            System.out.println ("Zero");
        int missingzeroes = getDigitCount(number) - getDigitCount(reverse(number));
        number = reverse ( number );
        while (number > 0) {

            int lastdigit = number % 10;
            if (lastdigit == 0) System.out.println ( "Zero" );
            if (lastdigit == 1) System.out.println ( "One" );
            if (lastdigit == 2) System.out.println ( "Two" );
            if (lastdigit == 3) System.out.println ( "Three" );
            if (lastdigit == 4) System.out.println ( "Four" );
            if (lastdigit == 5) System.out.println ( "Five" );
            if (lastdigit == 6) System.out.println ( "Six" );
            if (lastdigit == 7) System.out.println ( "Seven" );
            if (lastdigit == 8) System.out.println ( "Eight" );
            if (lastdigit == 9) System.out.println ( "Nine" );
            number = number / 10;

        }

        while (missingzeroes > 0) {
            System.out.println ( "Zero" );
            missingzeroes--;
        }

    }

        public static int reverse(int number) {
            if (number >= 0) {
                int reverse = 0;
                while (number > 0) {
                    int lastdigit = number % 10;
                    reverse = reverse * 10;
                    reverse = reverse + lastdigit;
                    number = number / 10;
                }
                return reverse;
            }

            int reverse = 0;
            while (number < 0) {
                int lastdigit = number % 10;
                reverse = reverse * 10;
                reverse = reverse + lastdigit;
                number = number / 10;
            }
            return reverse;

        }

        public static int getDigitCount(int number) {
            int count = 0;
            if (number == 0)
                count = 1;
            if (number < 0)
                count = -1;
            while (number > 0) {

                number = number / 10;
                count++;
            }
            return count;
        }
    }

