package Homework.OOP.Printer;

public class ColorPrinter extends Printer{

    private String color;

    public ColorPrinter setColor(String color) {
        this.color = color;
        return this;
    }

    public void generateColor(String color) {
        switch (color.toLowerCase()) {
            case "black":
                this.setColor("\u001B[30m");
                break;
            case "red":
                this.setColor("\u001B[31m");
                break;
            case "green":
                this.setColor("\u001B[32m");
                break;
            case "yellow":
                this.setColor("\u001B[33m");
                break;
            case "blue":
                this.setColor("\u001B[34m");
                break;
            case "magenta":
                this.setColor("\u001B[35m");
                break;
            case "cyan":
                this.setColor("\u001B[36m");
                break;
            case "white":
                this.setColor("\u001B[37m");
                break;
            default:
                this.setColor("");
                break;
        }
    }
    @Override
    public void print(String val){
        System.out.println(color + val + "\u001B[0m");
    }
}
