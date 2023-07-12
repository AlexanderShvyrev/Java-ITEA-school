package Homework.OOP.Files.CreateFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "data.txt";

        writeToFile(fileName, "Hello from test data");
        String content = readFromFile(fileName);
        System.out.println(content);
    }

    public static void writeToFile(String fileName, String content){
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.write(content);
        }catch (IOException e){
            System.out.println("Error occured while writing to file" + e.getMessage());
        }finally{
            if(fileWriter != null){
                try{
                    fileWriter.close();
                }catch(IOException e){
                    System.out.println("Error closing fileWriter" + e.getMessage());
                }
            }
        }
    }

    public static String readFromFile(String fileName){
        StringBuilder content = new StringBuilder();
        BufferedReader bufferedReader = null;

        try{
            bufferedReader = new BufferedReader(new FileReader(fileName));
            String line = null;
            while((line = bufferedReader.readLine()) != null){
                content.append(line).append("\n");
            }
        }catch(IOException e){
            System.out.println("Error reading the file" + e.getMessage());
        }finally{
            if(bufferedReader != null){
                try{
                    bufferedReader.close();
                }catch(IOException e){
                    System.out.println("Error closing the reader" + e.getMessage());
                }
            }
        }
        return content.toString();
    }
}
