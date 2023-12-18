package edu.nm.concurrency.patterns.creational.factory;

public class ClientProgram {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = new JavaDeveloperFactory();
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }
}
