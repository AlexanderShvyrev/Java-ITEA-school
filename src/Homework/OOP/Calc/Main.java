package Homework.OOP.Calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        double a = sc.nextDouble();
        System.out.println("Please enter the second number: ");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.println("Please enter arithmetic operator (+,-,* or /): ");
        String operator = sc.nextLine();
        switch(operator) {
            case "*":
                System.out.println(calculator.mul(a, b));
                break;
            case "+":
                System.out.println(calculator.add(a,b));
                break;
            case "/":
                System.out.println(calculator.div(a,b));
                break;
            case "-":
                System.out.println(calculator.sub(a,b));
                break;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }

}
