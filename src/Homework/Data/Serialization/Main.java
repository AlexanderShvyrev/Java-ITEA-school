package Homework.Data.Serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("/Users/alexandershvyrev/Desktop/ITEA/Lesson 1/Java Lesson 1/src/Homework/Data/Serialization/output.txt");
        Car car = new Car("Volvo", 45.000);
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            oos.writeObject(car);

            Car carOutput = (Car) ois.readObject();
            System.out.println(carOutput);
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
