package Homework.Fundamentals;

public class Sum {
    public static void main(String[] args) {
        int a = 3;
        int b = 10;
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println("The sum of a and b is " + sum);
    }
}
