package edu.nm.concurrency.patterns.behavioral.chain;

public class BugTracker {

    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new SimpleReportNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SimpleReportNotifier(Priority.ASAP);
        reportNotifier.setNextNotifier(emailNotifier);
        reportNotifier.setNextNotifier(smsNotifier);
        reportNotifier.notifyManager("Everything is OK.", Priority.ROUTINE);
        reportNotifier.notifyManager("Something went wrong!.", Priority.IMPORTANT);
        reportNotifier.notifyManager("Houston, we`ve had a problem here!!!", Priority.ASAP);
    }
}
