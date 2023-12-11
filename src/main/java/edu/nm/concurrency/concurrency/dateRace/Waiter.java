package edu.nm.concurrency.concurrency.dateRace;

public class Waiter implements Runnable {
    private boolean shouldFinish;

    public void finish() {
        shouldFinish = true;
    }

    public void run() {
        long iteration = 0;
        while (!shouldFinish) {
            iteration++;
        }
        System.out.println("Finished after: " + iteration);
    }

    public boolean isShouldFinish() {
        return shouldFinish;
    }

    public void setShouldFinish(boolean shouldFinish) {
        this.shouldFinish = shouldFinish;
    }
}
