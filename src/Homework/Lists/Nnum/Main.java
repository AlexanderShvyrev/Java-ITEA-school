package Homework.Lists.Nnum;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int N = sc.nextInt();
        List<Integer> ints = getIntegerList(N);
        int min = getMin(ints);
        System.out.println("Minimum num is: " + min);
    }

    public static List<Integer> getIntegerList(int N){
        List<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your integers: ");
        for (int i = 0; i < N ; i++) {
            int integer = scanner.nextInt();
            list.add(integer);
        }
        return list;
    }

    public static int getMin(List<Integer> ints){
        int min = Integer.MAX_VALUE;

        for (int num : ints) {
            if(num < min){
                min = num;
            }
        }

        return min;
    }
}
