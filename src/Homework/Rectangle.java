package Homework;

import java.util.Scanner;

public class Rectangle {

    public static void drawRectangle(int height, int width){
        for (int i = 0; i < height ; i++) {
            for (int j = 0; j < width ; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter height and width separated by a space: ");
        String input = sc.nextLine();
        String[] values = input.split(" ");
        if(values.length != 2){
            System.out.println("Error! Please enter height and width separated by space");
        }else{
            int height = Integer.parseInt(values[0]);
            int width = Integer.parseInt(values[1]);
            drawRectangle(height, width);
        }
    }
}
