package edu.nm.concurrency.patterns.structural.decorator;

public class JavaDeveloper implements Developer {

    @Override
    public String makeJob() {
        return "Write Java code.";
    }
}
