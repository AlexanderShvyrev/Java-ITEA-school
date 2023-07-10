package Homework.Lists.Rows;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("Enter lines (type 'end' to stop): ");

        String line;
        while(!(line = sc.nextLine()).equals("end")){
            sb.append(line).append("\n");
        }

        System.out.println(sb.toString());
    }
}
