package edu.nm.concurrency.concurrency.basicThreads;

import java.time.LocalDateTime;

public class RunnableScheduledExecutorService implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("Start task: " + LocalDateTime.now());
            Thread.sleep(2000);
            System.out.println("Finish task: " + LocalDateTime.now());
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
