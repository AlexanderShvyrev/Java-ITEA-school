package Homework.OOP.Documents;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your access key (pro/exp): ");
        String key = sc.nextLine();

        DocumentWorker dw;
        if(key.equalsIgnoreCase("pro")){
            dw = new ProDocumentWorker();
        }else if(key.equalsIgnoreCase("exp")){
            dw = new ExpertDocumentWorker();
        }else{
            dw = new DocumentWorker();
        }

        dw.openDocument();
        dw.editDocument();
        dw.saveDocument();
    }
}
