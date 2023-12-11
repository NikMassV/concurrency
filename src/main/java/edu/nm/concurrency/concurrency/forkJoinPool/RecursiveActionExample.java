package edu.nm.concurrency.concurrency.forkJoinPool;

import java.util.concurrent.RecursiveAction;

public class RecursiveActionExample extends RecursiveAction {

    private int value;

    public RecursiveActionExample(int value) {
        this.value = value;
    }

    @Override
    protected void compute() {
        if (value <= 4) {
            System.out.println("Hello before: " + Thread.currentThread().getId() + " " + value);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println("Hello after: " + Thread.currentThread().getId() + " " + value);
        } else {
            RecursiveActionExample recursiveActionExample1 = new RecursiveActionExample(value / 2);
            RecursiveActionExample recursiveActionExample2 = new RecursiveActionExample(value / 2);
            invokeAll(recursiveActionExample1, recursiveActionExample2);
        }
    }
}
