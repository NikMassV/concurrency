package edu.nm.concurrency.patterns.structural.proxy;

public class ProjectRunner {

    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com/project");
//        project.run(); //lazy initialization
    }
}
