package edu.nm.concurrency.patterns.creational.prototype;

public class VersionControlRunner {

    public static void main(String[] args) {
        Project project = new Project(1, "SuperProject", "SourceCode");
        System.out.println(project);
        ProjectFactory factory = new ProjectFactory(project);
        Project projectClone = factory.cloneProject();
        System.out.println(projectClone);
    }
}
