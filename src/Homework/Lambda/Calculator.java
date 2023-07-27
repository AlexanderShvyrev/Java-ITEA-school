package Homework.Lambda;

import java.util.function.BinaryOperator;

public class Calculator {
    public static void main(String[] args) {
        BinaryOperator<Integer> add = Integer::sum;
        BinaryOperator<Integer> subtract = (x,y) -> x-y;
        BinaryOperator<Integer> multiply = (x,y) -> x*y;
        BinaryOperator<Double> divide = (x,y) -> {
            if(y != 0){
                return x/y;
            }else{
                throw new ArithmeticException("Cannot divide by zero");
            }
        };

        int numOne = 2;
        int numTwo = 10;

        System.out.println("Addition: " + add.apply(numOne, numTwo));
        System.out.println("Subtraction: " + subtract.apply(numOne, numTwo));
        System.out.println("Multiplication: " + multiply.apply(numOne, numTwo));
        System.out.println("Division: " + divide.apply((double) numOne, (double) numTwo));

    }
}
