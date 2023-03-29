package Tasks;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input d");
        double d = sc.nextDouble();
        double pi = 3.14;
        double l = pi * d; // or Math.PI * d
        System.out.println("L is equal to " + l);
    }
}
