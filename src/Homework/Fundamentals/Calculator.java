package Homework.Fundamentals;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double operand1 = 10;
        double operand2 = 3;
        System.out.println("Please enter type of operator");
        Scanner sc = new Scanner(System.in);
        String sign = sc.nextLine();
        switch(sign){
            case "*":
                System.out.println(operand1 * operand2);
                break;
            case "+":
                System.out.println(operand1 + operand2);
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Error: cannot divide by zero");
                } else {
                    System.out.println(operand1 / operand2);
                }
                break;
            case "-":
                System.out.println(operand1 - operand2);
                break;
            default:
                System.out.println("Error: invalid operator");
        }
    }
}
