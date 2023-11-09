package edu.nm.concurrency.basicThreads;

import java.util.concurrent.Callable;

public class FromCallable implements Callable<Integer> {
    int number;

    // standard constructors
    public FromCallable(int number) {
        this.number = number;
    }

    public Integer call() {
        int fact = 1;
        // ...
        for(int count = number; count > 1; count--) {
            fact = fact * count;
        }

        return fact;
    }
}
