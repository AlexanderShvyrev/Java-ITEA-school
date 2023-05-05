package Homework;

import java.util.Scanner;

public class NumbersCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        boolean isSimple = true;
        if(num < 2){
            isSimple = false;
        }else {
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isSimple = false;
                    break;
                }
            }
        }
        if(isSimple){
            System.out.println("Your number is simple");
        }else{
            System.out.println("Your number is not simple");
        }

        if (num % 2 == 0) {
            System.out.println("The number is divisible by 2 without a remainder.");
        }
        if (num % 5 == 0) {
            System.out.println("The number is divisible by 5 without a remainder.");
        }
        if (num % 3 == 0) {
            System.out.println("The number is divisible by 3 without a remainder.");
        }
        if (num % 6 == 0) {
            System.out.println("The number is divisible by 6 without a remainder.");
        }
        if (num % 9 == 0) {
            System.out.println("The number is divisible by 9 without a remainder.");
        }
    }
}
