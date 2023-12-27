package edu.nm.concurrency.patterns.creational.abstarctfactory.website;

import edu.nm.concurrency.patterns.creational.abstarctfactory.Developer;
import edu.nm.concurrency.patterns.creational.abstarctfactory.ProjectManager;
import edu.nm.concurrency.patterns.creational.abstarctfactory.ProjectTeamFactory;
import edu.nm.concurrency.patterns.creational.abstarctfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new PhpQaTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new PhpProjectManager();
    }
}
