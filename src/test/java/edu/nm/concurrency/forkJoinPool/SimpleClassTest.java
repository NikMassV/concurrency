package edu.nm.concurrency.forkJoinPool;

import edu.nm.concurrency.concurrency.forkJoinPool.SimpleClass;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ForkJoinPool;

public class SimpleClassTest {

    @Test
    public void test1() {
        SimpleClass simpleClass = new SimpleClass();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        System.out.println(forkJoinPool.invoke(simpleClass));
    }

    @Test
    public void test2() {
        SimpleClass simpleClass = new SimpleClass();
        simpleClass.fork();
        System.out.println(simpleClass.join());
    }
}
