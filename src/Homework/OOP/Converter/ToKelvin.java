package Homework.OOP.Converter;

public class ToKelvin extends TemperatureConverter{
    public double convert(double celcius){
        double result = celcius + 273.15;
        System.out.println(celcius + " celcius in Kelvins is " + result);
        return result;
    }
}
