package edu.nm.concurrency.patterns.creational.abstarctfactory;

import edu.nm.concurrency.patterns.creational.abstarctfactory.banking.BankingTeamFactory;
import edu.nm.concurrency.patterns.creational.abstarctfactory.website.WebsiteTeamFactory;

public class ActionSiteProject {

    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating website...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
