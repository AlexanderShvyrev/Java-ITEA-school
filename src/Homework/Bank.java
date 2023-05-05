package Homework;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Bank {
    private static final double AMOUNT_OWNED = 1000;

    public static void makePayment(double amount){
        if(amount > AMOUNT_OWNED){
            System.out.println("Paid " + amount + ". Account balance overpaid: " + (double)(amount - AMOUNT_OWNED));
            System.out.println("Full amount paid");
        }else{
            System.out.println("Paid " + amount + ". Account balance: " + (double)(AMOUNT_OWNED - amount));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an amount paid: ");
        double amount = sc.nextDouble();
        makePayment(amount);
    }

}
