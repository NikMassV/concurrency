package edu.nm.concurrency.patterns.creational.abstarctfactory.website;

import edu.nm.concurrency.patterns.creational.abstarctfactory.ProjectManager;

public class PhpProjectManager implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("PHP managing...");
    }
}
