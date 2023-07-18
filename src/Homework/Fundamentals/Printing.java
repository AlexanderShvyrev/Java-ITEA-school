package Homework.Fundamentals;

public class Printing {

    public static void printRectangle(int height, int width){
        for (int i = 0; i < height ; i++) {
            for (int j = 0; j < width ; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static void printRightTriangle(int height){
        int runner = 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < runner ; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            runner++;
            System.out.print("\n");
        }
    }

    public static void printEqualTriangle(int height){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void printRhombus(int size){
        for (int i = 1; i <= size; i++) {
            int numSpaces = size - i;
            int numAsterisks = 2 * i - 1;
            for (int j = 1; j <= numSpaces; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= numAsterisks; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i = size - 1; i >= 1; i--) {
            int numSpaces = size - i;
            int numAsterisks = 2 * i - 1;
            for (int j = 1; j <= numSpaces; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= numAsterisks; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
    public static void main(String[] args) {
        printRectangle(4, 6);
        printRightTriangle(10);
        printEqualTriangle(10);
        printRhombus(10);
    }
}
