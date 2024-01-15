package edu.nm.concurrency.patterns.structural.facade;

public class SprintRunner {

    public static void main(String[] args) {
        Workflow workflow = new Workflow();
        workflow.solveProblems();
        // Wokr without facade
//        Job job = new Job();
//        job.doJob();
//        BugTracker bugTracker = new BugTracker();
//        bugTracker.startSprint();
//        Developer developer = new Developer();
//        developer.doJobBeforeDeadline(bugTracker);
//        bugTracker.finishSprint();
//        developer.doJobBeforeDeadline(bugTracker);
    }
}
