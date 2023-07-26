package Homework.Threads.Ids;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Three implements Runnable{
    private static final Object collectionLock = new Object();

    @Override
    public void run() {
        while (true) {
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            List<Integer> idsToSend = new ArrayList<>();

            synchronized (Two.idCollection) {
                idsToSend = new ArrayList<>(Two.idCollection);
                Two.idCollection.clear();
            }

            if (!idsToSend.isEmpty()) {
                for (Integer id : idsToSend) {
                    synchronized (Two.idCollection) {
                        Two.idCollection.remove(id);
                    }
                }
            }
        }
    }
}
