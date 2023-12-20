package edu.nm.concurrency.patterns.behavioral.observer;

public class JobSearcher {

    public static void main(String[] args) {
        JavaDevJobSite jobSite = new JavaDevJobSite();
        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");
        Observer firstSubscriber = new Subscriber("Alex");
        Observer secondSubscriber = new Subscriber("John");
        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);
        jobSite.addVacancy("Third Java Position");
        jobSite.removeVacancy("Second Java Position ");
    }
}
