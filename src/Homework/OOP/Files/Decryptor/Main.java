package Homework.OOP.Files.Decryptor;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("/Users/alexandershvyrev/Desktop/ITEA/Lesson 1/Java Lesson 1/src/Homework/OOP/Files/Decryptor/resources/myFile.txt");
        decrypt(f);
    }

    public static void decrypt(File f){
        StringBuilder stringBuilder = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(f))) {
            String line;
            while((line = reader.readLine()) != null){
                String decryptedLine = line.replaceAll("\\b(for|in|at|with|on)\\b", "Java");
                stringBuilder.append(decryptedLine).append(System.lineSeparator());
                System.out.println(decryptedLine);
            }
        }catch(IOException e){
            System.out.println("Error occured while decrypting file! " + e);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(f))) {
            writer.write(stringBuilder.toString());
        } catch (IOException e) {
            System.out.println("Error occurred while writing to the file: " + e.getMessage());
        }
    }
}
