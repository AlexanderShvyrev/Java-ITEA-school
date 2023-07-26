package Homework.Threads.Ids;

import java.io.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class One implements Runnable{
    File f = new File("/Users/alexandershvyrev/Desktop/ITEA/Lesson 1/Java Lesson 1/src/Homework/Threads/Ids/result.txt");

    @Override
    public void run() {
        try(FileWriter fileWriter = new FileWriter(f);
            BufferedWriter writer = new BufferedWriter(fileWriter)){

            while (true) {
                Integer id = null;
                synchronized (Two.idCollection) {
                    List<Integer> idCollection = Two.idCollection;
                    if (!idCollection.isEmpty()) {
                        id = idCollection.remove(0);
                    }
                }

                if (id != null) {
                    String currentTime = LocalDateTime.now().toString();
                    String result = "ID: " + id + " Date: " + currentTime;
                    System.out.println(result);
                    writer.write(result);
                    writer.newLine();
                    writer.flush();
                }

                TimeUnit.MILLISECONDS.sleep(1);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
