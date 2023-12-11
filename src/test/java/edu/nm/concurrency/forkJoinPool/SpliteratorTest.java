package edu.nm.concurrency.forkJoinPool;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

public class SpliteratorTest {
    int MAX = 32;
    List<Integer> elements = IntStream.range(1, MAX + 1).boxed().toList();

    @Test
    public void testIterator() {
        for (Iterator<Integer> iterator = elements.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void testSpliterator() {
        Spliterator<Integer> spliterator = elements.spliterator();
        Spliterator<Integer> spliterator1 = spliterator.trySplit();
        spliterator.forEachRemaining(System.out::println);
        System.out.println("--->>>");
        spliterator1.forEachRemaining(System.out::println);
    }

    @Test
    public void testParallelStream() {
        elements.parallelStream().forEach(el -> {
             System.out.println("Start: " + Thread.currentThread().getId() + ": " + el);
             try {
                  Thread.sleep(2000);
             } catch (InterruptedException ex) {

             }
             System.out.println("Finish: " + Thread.currentThread().getId() + ": " + el);
             }
        );
    }

    @Test
    public void testParallelStreamWithHandlingThreadsByForkJoinPool() throws ExecutionException, InterruptedException { //a few overhead
        ForkJoinPool forkJoinPool = new ForkJoinPool(MAX);
        forkJoinPool.submit(() ->
                elements.parallelStream().forEach(el -> {
                            System.out.println("Start: " + Thread.currentThread().getId() + ": " + el);
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException ex) {

                            }
                            System.out.println("Finish: " + Thread.currentThread().getId() + ": " + el);
                        }
                )).get();
        System.out.println("FINISH");
    }
}
