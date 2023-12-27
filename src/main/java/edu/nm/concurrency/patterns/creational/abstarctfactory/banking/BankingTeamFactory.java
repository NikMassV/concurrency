package edu.nm.concurrency.patterns.creational.abstarctfactory.banking;

import edu.nm.concurrency.patterns.creational.abstarctfactory.Developer;
import edu.nm.concurrency.patterns.creational.abstarctfactory.ProjectManager;
import edu.nm.concurrency.patterns.creational.abstarctfactory.ProjectTeamFactory;
import edu.nm.concurrency.patterns.creational.abstarctfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new JavaQaTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new JavaProjectManager();
    }
}
