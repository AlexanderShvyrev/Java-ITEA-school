package Homework.Fundamentals;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the height of your cylinder");
        double h = sc.nextDouble();
        System.out.println("Please enter the radius of your cylinder");
        double r = sc.nextDouble();
        double volume = Math.PI * Math.pow(r, 2) * h;
        double area = 2 * Math.PI * Math.pow(r, 2) + 2 * Math.PI * r * h;
        System.out.println("The volume of your cylinder is " + volume + " and surface area is " + area);
    }
}
