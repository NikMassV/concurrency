package edu.nm.concurrency.forkJoinPool;

import java.util.Arrays;
import java.util.concurrent.RecursiveTask;

public class ThreadCounter extends RecursiveTask<Integer> {

    private int[] array;

    public ThreadCounter(int[] array) {
        this.array = array;
    }

    protected Integer compute() {
        if (array.length <= 2) {
            System.out.printf("Task %s execute in thread %s%n", this, Thread.currentThread().getName());
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return Arrays.stream(array).sum();
    }
}
