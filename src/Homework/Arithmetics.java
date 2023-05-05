package Homework;

import java.util.Scanner;

public class Arithmetics {
    public static double add(double firstArg, double secondArg){
        return firstArg + secondArg;
    }

    public static double sub(double firstArg, double secondArg){
        return firstArg - secondArg;
    }

    public static double mul(double firstArg, double secondArg){
        return firstArg * secondArg;
    }

    public static double div(double firstArg, double secondArg){
        return firstArg / secondArg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide 2 numbers and operator: ");
        double firstArg = sc.nextDouble();
        double secondArg = sc.nextDouble();
        String operator = sc.next();
        switch (operator) {
            case "+":
                System.out.println(add(firstArg, secondArg));
                break;
            case "-":
                System.out.println(sub(firstArg, secondArg));
                break;
            case "*":
                System.out.println(mul(firstArg, secondArg));
                break;
            case "/":
                if(secondArg != 0){
                    System.out.println(div(firstArg, secondArg));
                }else {
                    System.out.println("Error: cannot divide by zero");
                    break;
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
