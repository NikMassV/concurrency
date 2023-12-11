package edu.nm.concurrency.threadPoolExecutor;

import edu.nm.concurrency.concurrency.basicThreads.MyCallable;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorTest {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2, 4, 1, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(2), //new SynchronousQueue<>()
                new MyReject()
        );
        for(int i = 0; i < 8; i++) {
            MyCallable myCallable = new MyCallable();
            threadPoolExecutor.submit(myCallable);
        }
        threadPoolExecutor.shutdown();
    }
}

class MyReject implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("REJECTED");
    }
}
