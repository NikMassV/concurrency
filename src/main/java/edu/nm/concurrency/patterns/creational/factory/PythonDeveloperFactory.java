package edu.nm.concurrency.patterns.creational.factory;

public class PythonDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }
}
