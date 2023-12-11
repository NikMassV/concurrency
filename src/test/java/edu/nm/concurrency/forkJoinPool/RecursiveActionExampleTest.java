package edu.nm.concurrency.forkJoinPool;

import edu.nm.concurrency.concurrency.forkJoinPool.RecursiveActionExample;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ForkJoinPool;

public class RecursiveActionExampleTest {

    @Test
    public void test() {
        int MAX = 128;
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.invoke(new RecursiveActionExample(MAX));
        System.out.println("FINISH");
    }
}
