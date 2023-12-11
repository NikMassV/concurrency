package edu.nm.concurrency.executorService;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceTest {

    @Test
    public void test() throws Exception{
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<MyCallable> tasks = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            MyCallable myCallable = new MyCallable();
            tasks.add(myCallable);
        }
        List<Future<Long>> futures = executorService.invokeAll(tasks);
        for(Future<Long> f : futures) {
            System.out.println(f.get());
        }
        System.out.println("FINISH");
        executorService.shutdown();
    }
}

class MyCallable implements Callable<Long> {

    @Override
    public Long call() {
        try {
            System.out.println("Started: " + Thread.currentThread().getId());
            Thread.sleep(1000 + Math.round(Math.random() * 5000));
            System.out.println("Finished: " + Thread.currentThread().getId());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return Thread.currentThread().getId();
    }
}
