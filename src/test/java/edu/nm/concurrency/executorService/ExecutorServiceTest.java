package edu.nm.concurrency.executorService;

import edu.nm.concurrency.concurrency.basicThreads.MyCallable;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
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
