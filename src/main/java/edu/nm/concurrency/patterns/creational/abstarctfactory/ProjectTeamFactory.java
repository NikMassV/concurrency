package edu.nm.concurrency.patterns.creational.abstarctfactory;

public interface ProjectTeamFactory {

    Developer getDeveloper();

    Tester getTester();

    ProjectManager getProjectManager();
}
