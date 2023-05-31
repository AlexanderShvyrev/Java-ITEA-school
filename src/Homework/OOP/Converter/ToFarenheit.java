package Homework.OOP.Converter;

public class ToFarenheit extends TemperatureConverter{
    public double convert(double celcius){
        double result = (celcius * 9/5) + 32;
        System.out.println(celcius + " celcius in Farenheits is " + result);
        return result;
    }
}
