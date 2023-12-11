package edu.nm.concurrency.dateRace;

import edu.nm.concurrency.concurrency.dateRace.Waiter;
import org.junit.jupiter.api.Test;

public class WaiterTest {

    @Test
    public void test() throws InterruptedException {
        Waiter waiter = new Waiter();
        Thread waiterThread = new Thread(waiter);
        waiterThread.start();
        new Thread(() -> {
            while (!waiter.isShouldFinish()) {
                // do some work
            }
            waiter.setShouldFinish(false); // introduce a data race
        }).start();
        waiter.finish();
        waiterThread.join();
    }
}
