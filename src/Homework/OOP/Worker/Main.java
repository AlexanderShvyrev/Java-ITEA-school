package Homework.OOP.Worker;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Worker[] workers = new Worker[5];
        Scanner sc = new Scanner(System.in);
            for (int i = 0; i < workers.length ; i++) {
                System.out.println("Please enter the name of employee number: " + (i + 1));
                String name = sc.nextLine();
                System.out.println("Enter initials: ");
                String initials = sc.nextLine();
                System.out.println("Enter job title: ");
                String title = sc.nextLine();
                try{
                    System.out.println("Enter year of employment: ");
                    int year = sc.nextInt();
                    sc.nextLine();
                    workers[i] = new Worker(name, initials, title, year);
                }catch (Exception e){
                    throw new IllegalArgumentException("Invalid year format");
                }
            }
            Arrays.sort(workers, (worker1, worker2) -> worker1.getLastname().compareToIgnoreCase(worker2.getLastname()));
        System.out.println("\nWorkers in alphabetical order: ");
        for (Worker worker : workers) {
            System.out.println("\n" + worker.toString());
        }
        System.out.println("Please enter years of employment: ");
        int experience = sc.nextInt();
        for (Worker worker : workers) {
            Calendar cal = Calendar.getInstance();
            int currentYear = cal.get(Calendar.YEAR);
            if(worker.getYearsOfExperience(currentYear) > experience){
                System.out.println(worker.getLastname());
            }
        }
        sc.close();
    }
}
