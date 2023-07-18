package Homework.Fundamentals;

public class CustomerArray {
    public static void main(String[] args) {
        int[] customerArray = new int[] {1, 2, -35, 456, 32, 3};
        int min = 0;
        int max = 0;
        int sum = 0;
        for (int i = 0; i < customerArray.length; i++) {
            sum+=customerArray[i];
            if(customerArray[i] < min){
                min = customerArray[i];
            }
            if(customerArray[i] > max){
                max = customerArray[i];
            }
            if(customerArray[i] % 2 != 0) {
                System.out.println(customerArray[i] + " is odd");
            }
        }
        System.out.println("Max num is " + max);
        System.out.println("Min num is " + min);
        System.out.println("Sum is " + sum);
        System.out.println("Arithmetic is " + sum/customerArray.length);
    }
}
