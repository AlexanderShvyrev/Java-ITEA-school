package Homework;

import java.util.Scanner;

public class FactSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        double sum = 1;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            sum += 1.0 / fact;
        }

        System.out.printf("The sum of the series is %.3f", sum);
    }
}
