package edu.nm.concurrency.patterns.creational.abstarctfactory.banking;

import edu.nm.concurrency.patterns.creational.abstarctfactory.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java coding...");
    }
}
