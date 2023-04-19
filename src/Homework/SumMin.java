package Homework;

public class SumMin {
    public static void main(String[] args) {
        int a = 1;
        int b = 15;
        int sum = 0;
        for (int i = a+1; i < b ; i++) {
            sum += i;
            if(i%2 != 0){
                System.out.println(i);
            }
        }
        System.out.println("The sum is: " + sum);
    }
}
