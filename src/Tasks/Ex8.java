package Tasks;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input two numbers");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double sa = (a + b)/2;
        System.out.println("Result is " + sa);
    }
}
