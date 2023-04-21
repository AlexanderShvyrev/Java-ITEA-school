package Homework;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.print(num1 + " " + num2 + " ");
        int next;
        for (int i = 2; i < 10; i++) {
            next = num1 + num2;
            System.out.print(next + " ");
            num1 = num2;
            num2 = next;
        }
    }
}
