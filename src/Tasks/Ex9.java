package Tasks;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input two numbers");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double srGeom = Math.sqrt(a * b);
        System.out.println("Result is " + srGeom);
    }
}
