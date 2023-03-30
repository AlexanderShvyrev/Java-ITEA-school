package Tasks.Beginner;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input two numbers");
        double r1 = sc.nextDouble();
        double r2 = sc.nextDouble();
        double s1 = Math.PI * Math.pow(r1, 2);
        double s2 = Math.PI * Math.pow(r2, 2);
        double s3 = s1 - s2;
        System.out.println("S1 is " + s1 + " S2 is " + s2 + " S3 is " + s3);
    }
}
