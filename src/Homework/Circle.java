package Homework;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        double pi = Math.PI;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the desired radius");
        double r = sc.nextDouble();
        double s = pi * Math.pow(r, 2);
        System.out.println("Your circle's square area is " + s);
    }
}
