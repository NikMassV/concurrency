package edu.nm.concurrency.concurrency.forkJoinPool;

import java.util.concurrent.RecursiveTask;

public class SimpleClass extends RecursiveTask<String> {

    @Override
    protected String compute() {
        return """
                I am just innocent simple class
                """;
    }
}
