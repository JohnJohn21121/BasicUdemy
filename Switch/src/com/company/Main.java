package com.company;

public class Main {

    public static void main(String[] args) {
//	int value = 3;
//	if (value==1){
//        System.out.println("Value was 1");
//    }else if(value==2){
//        System.out.println("Value was 2");
//    }else {
//        System.out.println("Value was not 1 or 2");
//    }
	int switchValue = 3;
	switch (switchValue){
        case 1:
            System.out.println("Value was 1");
            break;
        case 2:
            System.out.println("value was 2");
            break;
        case 3: case 4:case 5:
            System.out.println("was a 3, or 4, or a 5");
            System.out.println("Actually it was a " + switchValue);
            break;

            default:
                System.out.println("was not 1 or 2");
                break;
    }
    char charValue = 'A';
	switch (charValue){
        case 'A':
            System.out.println("A Was Found");
            break;
        case 'B':
            System.out.println("B Was Found");
            break;
        case 'C': case 'D': case 'E':
            System.out.println(charValue + " Was Found");
            break;

            default:
                System.out.println("Was not A, B, C, D or E");
                break;
    }
    }
}
