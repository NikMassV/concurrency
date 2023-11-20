package edu.nm.concurrency.concurrency.forkJoinPool;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.concurrent.RecursiveTask;

@Service
public class ValueSumCounter extends RecursiveTask<Integer> {

    private int[] array;

    @Transactional
    public ValueSumCounter(int[] array) {
        this.array = array;
    }

    @Override
    protected Integer compute() {
        if(array.length <= 2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return Arrays.stream(array).sum();
        }
        ValueSumCounter firstHalfArrayValueSumCounter = new ValueSumCounter(Arrays.copyOfRange(array, 0, array.length/2));
        ValueSumCounter secondHalfArrayValueSumCounter = new ValueSumCounter(Arrays.copyOfRange(array, array.length/2, array.length));
        firstHalfArrayValueSumCounter.fork();
        secondHalfArrayValueSumCounter.fork();
        return firstHalfArrayValueSumCounter.join() + secondHalfArrayValueSumCounter.join();
    }
}
