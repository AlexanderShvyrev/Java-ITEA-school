package Homework.OOP.Converter;

public class Main {
    public static void main(String[] args) {
        ToFarenheit farenheit = new ToFarenheit();
        farenheit.convert(0.0);
        ToKelvin kelvin = new ToKelvin();
        kelvin.convert(1);
    }
}
