package Homework.OOP.Printer;

public class PrinterTwo extends Printer{
    @Override
    public void print(String val){
        System.out.println(colorCode + val + "\u001B[0m");
    }
}
