package edu.nm.concurrency.locks;

import edu.nm.concurrency.concurrency.locks.Safelock;
import org.junit.jupiter.api.Test;

public class SafelockTest {

    @Test
    public void test() {
        Safelock.Friend alphonse =
                new Safelock.Friend("Alphonse");
        Safelock.Friend gaston =
                new Safelock.Friend("Gaston");
        new Thread(new Safelock.BowLoop(alphonse, gaston)).start();
        new Thread(new Safelock.BowLoop(gaston, alphonse)).start();
    }
}
