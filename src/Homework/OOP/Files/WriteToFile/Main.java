package Homework.OOP.Files.WriteToFile;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("/Users/alexandershvyrev/Desktop/ITEA/Lesson 1/Java Lesson 1/src/Homework/OOP/Files/CreateFile/WriteToFile/resources/test.txt");
        String newText = "Hi! I am a new text here!";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(f, true))){
            writer.newLine();
            writer.write(newText);
        } catch (IOException x) {
            System.err.format("Could not write to the file! " + x);
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(f))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("Error reading file! " + e);
        }
    }
}
