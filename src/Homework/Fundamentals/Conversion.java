package Homework.Fundamentals;

import java.util.Scanner;

public class Conversion {
    public static double convert(double amount, double rate){
        return amount * rate;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an amount: ");
        double amount = sc.nextDouble();
        System.out.println("Enter the conversion rate: ");
        double rate = sc.nextDouble();
        System.out.println(convert(amount, rate));
    }
}
