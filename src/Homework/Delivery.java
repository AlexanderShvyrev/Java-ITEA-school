package Homework;

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Please enter the number of customers (enter exit to quit the program): ");
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if (num < 0) {
                    System.out.println("Incorrect input! Number of customers cannot be negative");
                }else if(num == 0){
                    System.out.println("1 route");
                }else {
                    int routes = 1;
                    int i = 1;
                    do {
                        routes *= i;
                        i++;
                    } while (i <= num);
                    System.out.println("You can have " + routes + " of possible routes");
                }
            } else {
                String input = sc.next();
                if(input.equalsIgnoreCase("exit")){
                    System.out.println("Exiting...");
                    sc.close();
                    break;
                }else{
                    System.out.println("Incorrect input! Please enter a valid integer.");
                }
            }
        } while (true);
        sc.close();
    }
}
