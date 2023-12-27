package edu.nm.concurrency.patterns.creational.abstarctfactory.banking;

import edu.nm.concurrency.patterns.creational.abstarctfactory.ProjectManager;

public class JavaProjectManager implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Java managing...");
    }
}
