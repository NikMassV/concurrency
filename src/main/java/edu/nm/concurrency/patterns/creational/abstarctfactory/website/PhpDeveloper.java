package edu.nm.concurrency.patterns.creational.abstarctfactory.website;

import edu.nm.concurrency.patterns.creational.abstarctfactory.Developer;

public class PhpDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("PHP coding...");
    }
}
