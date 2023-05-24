package Homework.OOP.Printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Hello world");

        Printer colorPrinter = new PrinterOne();
        colorPrinter.generateColor("red");
        colorPrinter.print("Hello world");

        Printer anotherPrinter = new PrinterTwo();
        anotherPrinter.generateColor("yellow");
        anotherPrinter.print("This text is yellow");
    }
}
