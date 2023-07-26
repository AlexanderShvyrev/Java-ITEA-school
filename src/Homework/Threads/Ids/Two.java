package Homework.Threads.Ids;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Two implements Runnable{
    static final List<Integer> idCollection = new ArrayList<>();

    @Override
    public void run() {
        Random random = new Random();

        while (true) {
            int randomId = random.nextInt(100);
            synchronized (idCollection) {
                idCollection.add(randomId);
            }

            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
