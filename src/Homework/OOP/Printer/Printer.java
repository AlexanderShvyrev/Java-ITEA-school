package Homework.OOP.Printer;

public class Printer {

    protected String colorCode;
    public void print(String val){
        System.out.println(val);
    }

    protected void generateColor(String color){
        switch (color.toLowerCase()) {
            case "black":
                colorCode = "\u001B[30m";
                break;
            case "red":
                colorCode = "\u001B[31m";
                break;
            case "green":
                colorCode = "\u001B[32m";
                break;
            case "yellow":
                colorCode = "\u001B[33m";
                break;
            case "blue":
                colorCode = "\u001B[34m";
                break;
            case "magenta":
                colorCode = "\u001B[35m";
                break;
            case "cyan":
                colorCode = "\u001B[36m";
                break;
            case "white":
                colorCode = "\u001B[37m";
                break;
            default:
                colorCode = "";
                break;
        }
    }
}
