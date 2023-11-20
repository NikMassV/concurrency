package edu.nm.concurrency.forkJoinPool;

import edu.nm.concurrency.concurrency.forkJoinPool.ThreadCounter;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;

public class ThreadCounterTest {

    @Test
    public void test() {
        int[] array = getInitArray(10000);
        ThreadCounter counter = new ThreadCounter(array);
        System.out.println(new Date());
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        System.out.println(forkJoinPool.invoke(counter));
        System.out.println(new Date());
    }

    public static int[] getInitArray(int capacity) {
        int[] array = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            array[i] = 3;
        }
        return array;
    }
}
