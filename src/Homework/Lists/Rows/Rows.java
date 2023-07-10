package Homework.Lists.Rows;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rows {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lines (type 'end' to stop): ");
        while(true){
            String line = sc.nextLine();
            if(line.equalsIgnoreCase("end")){
                break;
            }
            lines.add(line);
        }
        System.out.println("Your output: ");
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
