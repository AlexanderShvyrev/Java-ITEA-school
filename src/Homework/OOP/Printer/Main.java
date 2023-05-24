package Homework.OOP.Printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Hello world");

        Printer colorPrinter = new ColorPrinter();
        ((ColorPrinter) colorPrinter).generateColor("red");
        colorPrinter.print("You are red here, Andrei");

        Printer anotherPrinter = new ColorPrinter();
        ColorPrinter colorfulAnotherPrinter = (ColorPrinter) anotherPrinter;
        colorfulAnotherPrinter.generateColor("yellow");
        colorfulAnotherPrinter.print("You are yellow here, Andrei");
    }
}
