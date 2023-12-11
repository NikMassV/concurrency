package edu.nm.concurrency.concurrency.basicThreads;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Long> {

    @Override
    public Long call() {
        try {
            System.out.println("Started: " + Thread.currentThread().getId());
            Thread.sleep(2000);
            System.out.println("Finished: " + Thread.currentThread().getId());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return Thread.currentThread().getId();
    }
}
